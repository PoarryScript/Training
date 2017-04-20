package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 * <p>
 * <p>
 * <p>
 * 328. Odd Even Linked List
 * <p>
 * <p>
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * <p>
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * <p>
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 */
public class Solution_328 {

    public static void main(String[] args) {
        Solution_328 solution_328 = new Solution_328();


        solution_328.oddEvenList(LinkedListUtils.createODDListNode());

    }


    public ListNode oddEvenList(ListNode head) {

        if (head == null||head.next==null) {
            return head;
        }
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode p = head;

        while (p.next!=null&&p.next.next!=null){
            ListNode node = p;


            p = p.next;
            node.next = p.next;

            ListNode node1 = p.next.next;
            if (node1!=null&&node1.val%2==1) {
                p.next.next = p;
                p.next = node1;
            }
        }
        LinkedListUtils.printLinkedList(newNode);
        return newNode;

    }
}
