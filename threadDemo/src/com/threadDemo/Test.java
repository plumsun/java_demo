package com.threadDemo;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @date: 2022/7/18 12:01
 * @author: LiHaoHan
 * @program: com.threadDemo
 */
public class Test implements Cloneable {
    private String id;
    private String name;
    private Object obj;

    public Test() {
    }

    public Test(String id, String name, Object obj) {
        this.id = id;
        this.name = name;
        this.obj = obj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", obj=" + obj +
                '}';
    }

    public static void main(String[] args) throws Exception {
        HashMap o = (HashMap)test();

        Object pk = o.get("pk");

        System.out.println("pk = " + pk);

        ArrayList<Test> list1 = new ArrayList<>();
        ArrayList<Test> list2 = new ArrayList<>();
        list1.add(new Test());
        list1.add(new Test());
        Collections.copy(list1,list2);
        // BeanUtilsBean.getInstance().copyProperties(dest, orig);
        System.out.println("list2 = " + list2);
        Test test = list1.get(1);
        Test clone =(Test) test.clone();
        clone.setId("3");
        System.out.println("tests = " + list1);
        System.out.println("clone = " + clone);
        // CopyOnWriteArrayList
        // a();
    }

    //Steam流
    public void testObj(){
        List<Test> tests = new ArrayList<>();
        tests.add(new Test());
        tests.add(new Test());
        tests.add(new Test());
        // tests.stream().map(data -> data.getId()).sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
        tests.stream().map(Test::getId).forEach(System.out::println);
    }

    //值传递和引用传递测试
    public static void a(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put(1,1);
        Integer integer = new Integer(1);
        Integer a = 3;
        String str = "list1";
        String str2 = new String("list2");
        b(integer,map,str,str2);
        b(a,map,str,str2);
        System.out.println(a+" "+integer+" "+map.get(1)+str+str2);
    }
    public static void b(Integer integer,HashMap map,String str,String str2){
        str = "list3";
        str2 = new String("list3");
        integer=2;
        map.put(1,2);
    }


    /*
        level 回文数
        ana,n.aba|n%ana
     */
    public static Object test(){
        String str = "hello";
        String s = "ll";
        int i = str.indexOf(s);
        System.out.println("i = " + i);
        HashSet<Object> set = new HashSet<>();
        ArrayList<Object> list = new ArrayList<>();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("data",list);
        map.put("pk","1");
        System.out.println("map = " + map);
        Test test = new Test();
        test.setObj(map);
        return test;
    }

    //替换字符串中的特殊字符
    public static void testRegex() throws Exception {
        String str="ana,n.aba|n%ana";
        String regEx = "[,`~!@#$%^&*()+=|{}':;'\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        boolean isfind = m.find();
        System.err.println(isfind);
        //regex
        String replaceAll = str.replaceAll(regEx, "");
        System.out.println(replaceAll);
    }
}
