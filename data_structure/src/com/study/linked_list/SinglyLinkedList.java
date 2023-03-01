package com.study.linked_list;

import java.util.Objects;

/**
 * 单向链表
 *
 * @author LiHaoHan
 * @date 2023/3/1
 */
public class SinglyLinkedList {

    public MyNode head = new MyNode(0, null);

    public void list() {
        MyNode next = head.getNext();
        while (next != null) {
            System.out.println("next = " + next);
            next = next.getNext();
        }
    }

    public void add(MyNode node) {
        MyNode headNext = head.getNext();
        node.setNext(headNext);
        head.setNext(node);
    }


    public void orderAdd(MyNode node) {
        MyNode tempNode = head;
        while (true) {
            if (tempNode.getNext() == null) {
                break;
            }
            Integer tempNo = tempNode.getNext().getNo();
            if (tempNo > node.getNo()) {
                break;
            } else if (Objects.equals(tempNo, node.getNo())) {
                return;
            }
            tempNode = tempNode.getNext();
        }
        node.setNext(tempNode.getNext());
        tempNode.setNext(node);
    }


    public void del(Integer no) {
        MyNode tempNode = head;
        if (tempNode == null) {
            return;
        }
        while (true) {
            Integer tempNo = tempNode.getNext().getNo();
            if (Objects.equals(tempNo, no)) {
                break;
            }
            tempNode = tempNode.getNext();
            if (tempNode == null) {
                return;
            }
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }

    public int size() {
        MyNode next = head.getNext();
        int num = 0;
        while (next != null) {
            num++;
            next = next.getNext();
        }
        return num;
    }

    public void update(MyNode node) {
        MyNode next = head.getNext();
        if (next == null) {
            return;
        }
        while (!Objects.equals(next.getNo(), node.getNo())) {
            next = next.getNext();
            if (next == null) {
                return;
            }
        }
        next.setNo(node.getNo());
        next.setVal(node.getVal());
    }

    public MyNode getReciprocalNode(int number) {
        int size = size();
        if (size < number) {
            return null;
        }
        int index = size - number + 1;
        MyNode node = null;
        MyNode temp = head.getNext();
        for (int i = 0; i < index; i++) {
            node = temp;
            temp = temp.getNext();
        }
        return node;
    }

    public void reverse(MyNode head) {
        MyNode reverse = new MyNode(0, null);
        MyNode temp = head.getNext();
        MyNode next = null;
        while (temp != null) {
            next = temp.getNext();
            temp.setNext(reverse.getNext());
            temp = next;
        }
        head.setNext(reverse.getNext());
    }
}
