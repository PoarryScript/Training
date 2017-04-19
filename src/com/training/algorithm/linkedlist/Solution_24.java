package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 * <p>
 * <p>
 * 24. Swap Nodes in Pairs
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class Solution_24 {


    public static void main(String[] args) {

        Solution_24 solution = new Solution_24();
        solution.swapPairs(LinkedListUtils.createListNode());
    }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.printLinkedList(head);
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p = head;


        while (p.next!=null &&p.next.next!=null){
            ListNode node = p;
            p = p.next;
            node.next = p.next;


            ListNode node1 = p.next.next;
            p.next.next = p;
            p.next = node1;


        }

        System.out.println("after reverse");
        LinkedListUtils.printLinkedList(preHead.next);
        return preHead.next;
    }
}
