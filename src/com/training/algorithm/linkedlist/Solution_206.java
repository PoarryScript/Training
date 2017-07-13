package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 * <p>
 * <p>
 * 206. Reverse Linked List
 * <p>
 * <p>
 * Reverse a singly linked list.
 */
public class Solution_206 {

    public static void main(String[] args) {

        Solution_206 solution = new Solution_206();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        solution.reverseList(node);

    }


   /* public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.printLinkedList(head);

        ListNode newNode = head;
        ListNode newHead = head.next;
        newNode.next = null;
        while (newNode != null && newHead != null) {
            ListNode node = newHead.next;
            newHead.next = newNode;
            newNode = newHead;
            newHead = node;
        }
        System.out.println("after reverse ");
        LinkedListUtils.printLinkedList(newNode);
        return newNode;
    }*/

    public ListNode reversesList(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode newListNode = null;
        while (listNode != null) {

            ListNode node = listNode.next;
            newListNode = listNode;
        }
        return newListNode;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.printLinkedList(head);

        ListNode newNode = null;
        while (head != null) {
            ListNode node = head.next;
            head.next = newNode;
            newNode = head;
            head = node;
        }
        System.out.println("after reverse ");
        LinkedListUtils.printLinkedList(newNode);
        return newNode;
    }

}
