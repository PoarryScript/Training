package com.training.algorithm.linkedlist;

/**
 * Created by j-yangbo on 2017/4/19.
 * <p>
 * 21. Merge Two Sorted Lists
 * <p>
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution_21 {

    public static void main(String[] args) {

        Solution_21 solution_21 = new Solution_21();

        solution_21.mergeTwoLists(LinkedListUtils.createListNode(),LinkedListUtils.createListNode1());
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;

        while (l1 != null || l2 != null) {
            if (l1 != null &&l2!=null) {
                if (l1.val < l2.val) {
                    p.next =l1;
                    l1 = l1.next;

                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            }else if (l1 == null) {
                p.next = l2;
                break;
            } else if(l2==null){
                p.next = l1;
                break;
            }

        }
        LinkedListUtils.printLinkedList(listNode.next);
        return listNode.next;
    }
}
