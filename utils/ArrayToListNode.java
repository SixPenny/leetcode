package com.dylan.leetcode.util;

import com.dylan.leetcode.ListNode;

/**
 * utils class to convert an array to list
 */
public class ArrayToListNode {
    public static ListNode to(String nums) {
        String[] ints = nums.replace("[", "")
                .replace("]", "").split(",");

        if (ints.length == 0) {
            return null;
        }
        ListNode node = new ListNode(0);
        ListNode tail = node;
        for (String is : ints) {
            int i = Integer.valueOf(is);
            tail.next = new ListNode(i);
            tail = tail.next;
        }

        return node.next;
    }
}
