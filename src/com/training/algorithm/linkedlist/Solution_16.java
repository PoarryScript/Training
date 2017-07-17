package com.training.algorithm.linkedlist;

import java.util.ArrayList;

/**
 * Created by yangbo on 2017/7/13.
 */
public class Solution_16 {
    public static void main(String[] args) {
        Solution_16 solution = new Solution_16();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        LinkedListUtils.printLinkedList(solution.oddEvenList(node));
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode oddNode = new ListNode(-1);
        ListNode evenNode = new ListNode(-1);
        ListNode currentNode = head;
        while (currentNode!=null){
            if (currentNode.val%2==0){
                evenNode.next = currentNode;
                evenNode = evenNode.next;
            }else if (currentNode.val%2==1){
                oddNode.next = currentNode;
                oddNode = oddNode.next;
            }
            currentNode = currentNode.next;
        }
        return oddNode;

    }

    /**
     * Given 1->2->3->4->5->NULL and k = 2,
     * return 4->5->1->2->3->NULL.
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        ArrayList<ListNode> nodeArrayList = new ArrayList<>();
        ListNode copyNode = head;
        while (copyNode != null) {
            nodeArrayList.add(copyNode);
            copyNode = copyNode.next;
            if (copyNode == null) {
                break;
            }
        }
        if (k > nodeArrayList.size()) {
            return head;
        }
        ArrayList<ListNode> childList = (ArrayList<ListNode>) nodeArrayList.subList(nodeArrayList.size() - 1 - k, nodeArrayList.size() - 1);
        nodeArrayList.addAll(0, childList);
        ListNode newNode = new ListNode(-1);
        ListNode headNode = new ListNode(nodeArrayList.get(0).val);
        ListNode copyHeadNode = new ListNode(nodeArrayList.get(0).val);
        newNode.next = headNode;
        for (int i = 1; i < nodeArrayList.size(); i++) {
            ListNode currentNode = new ListNode(nodeArrayList.get(i).val);

        }
        return head;
    }

}
