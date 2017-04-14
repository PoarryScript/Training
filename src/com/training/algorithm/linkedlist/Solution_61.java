package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 61. Rotate List
 * <p>
 * <p>
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
public class Solution_61 {

    public static void main(String[] args) {

        String string ="2";

    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode root = head;

        int size = 0;
        while (root != null) {
            size++;
            root = root.next;
        }
        ListNode newNode = head;
        ListNode headPartNode;
        ListNode tailPartNode;

        while (newNode != null) {
            newNode = newNode.next;
            size--;
            if (size == k) {
                tailPartNode = newNode;
            }
        }
        return null;
    }

}
