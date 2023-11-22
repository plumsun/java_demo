package com.study.demo;

import java.util.ArrayDeque;

/**
 * @author LiHaoHan Created on 2023/11/2
 */
public class Test {
    public ListNode subtractTwoNumbers(ListNode l1, ListNode l2) {
        ArrayDeque<Integer> aStack = new ArrayDeque<>();
        ArrayDeque<Integer> bStack = new ArrayDeque<>();
        while (l1 != null) {
            aStack.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            bStack.push(l2.val);
            l2 = l2.next;
        }
        int digits = 0;
        ListNode listNode = null;
        while (!aStack.isEmpty() || !bStack.isEmpty()) {
            int aNum = aStack.isEmpty() ? 0 : aStack.pop() - digits;
            int bNum = bStack.isEmpty() ? 0 : bStack.pop();
            int num;
            if (aNum >= bNum) {
                num = aNum - bNum;
                digits = 0;
            } else {
                num = aNum + 10 - bNum;
                digits += 1;
            }
            ListNode node = new ListNode(num);
            node.next = listNode;
            listNode = node;
        }
        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
