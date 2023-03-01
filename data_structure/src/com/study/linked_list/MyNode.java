package com.study.linked_list;

/**
 * @author LiHaoHan
 * @date 2023/3/1
 */
public class MyNode {

    private Integer no;

    private String val;

    private MyNode next;


    public MyNode() {
    }

    public MyNode(Integer no, String val) {
        this.no = no;
        this.val = val;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public MyNode getNext() {
        return next;
    }


    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "no=" + no +
                ", val='" + val + '\'' +
                '}';
    }
}
