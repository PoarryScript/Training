package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 */
public class LinkedListUtils {

    public static ListNode createListNode() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        return node;
    }

    public static void printLinkedList(ListNode node) {
        if (node == null) {
            System.out.println("empty LinkedList");
            return;
        }
        while (node!= null) {
            System.out.println("" + node.val);
            node = node.next;
        }
    }
}
