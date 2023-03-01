package com.study.linked_list;

/**
 * @author LiHaoHan
 * @date 2023/3/1
 */
public class LikedDemo {

    public static void main(String[] args) {
        MyNode node1 = new MyNode(1,"1");
        MyNode node2 = new MyNode(2,"2");
        MyNode node3 = new MyNode(3,"3");
        MyNode node4 = new MyNode(4,"4");
        MyNode node5 = new MyNode(5,"5");

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.orderAdd(node1);
        linkedList.orderAdd(node2);
        linkedList.orderAdd(node4);
        linkedList.orderAdd(node3);
        linkedList.orderAdd(node5);
        linkedList.list();
        MyNode reciprocalNode = linkedList.getReciprocalNode(2);
        System.out.println("reciprocalNode = " + reciprocalNode);
        linkedList.reverse(linkedList.head);
        linkedList.list();
    }
}
