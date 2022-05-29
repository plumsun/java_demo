package com.itheima02.constructor;
/*
*   需求: 求两数(int)之和
*   解决:
*       1. 先定义方法:方法名, 参数列表, 返回值
*       2. 后调用
*
*   java中的注释:
*       1. 单行: //
*       2. 多行: /*  *斜杠
*       3. 文档: /** *斜杠
*
*   方法:
*       1. 任何方法都有return
*           1). 有返回值的时候必能省略
*           2). 没有返回值的可以省略(在方法的最后一行)
*           3). 方法调用return之后,在栈内存中弹出(弹栈)
*
*   集成开发工具(eclipse/idea)的快捷功能:
*       反向定义: 先调用后定义
* */
public class Demo03 {

    public static void main(String[] args) {

        int result = add(1, 2);
        System.out.println(result);

        cook("鱼");

        int result2 = add2(1,2);

        cook2("白菜");
    }

    private static void cook2(String cai) {
        System.out.println("水煮" +cai);
    }

    private static int add2(int a, int b) {
        return a+b;
    }

    /**
     * 这个水煮食物的方法
     * @param cai 食材
     */
    public static void cook(String cai){
        System.out.println("水煮" + cai);
        return;
    }
    /**
     * 这是一个两数的求和
     * @param a  第一个数
     *           参数: arguments / parameter
     * @param b  第二个数
     * @return
     *          两数之和
     */
    public static int add(int a, int b){
        return a + b;
    }
}
