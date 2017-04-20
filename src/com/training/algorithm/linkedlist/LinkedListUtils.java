package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 */
public class LinkedListUtils {

    public static ListNode createListNode() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(76);
        ListNode node4 = new ListNode(88);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node;
    }

    public static ListNode createListNode1() {
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(12);
        ListNode node3 = new ListNode(43);
        ListNode node4 = new ListNode(66);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node;
    }
    public static ListNode createODDListNode() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
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
