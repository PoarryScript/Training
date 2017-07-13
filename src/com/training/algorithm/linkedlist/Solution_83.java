package com.training.algorithm.linkedlist;

import com.training.algorithm.Utils;
import com.training.algorithm.tree.Sulotion_110;

import java.util.ArrayList;

/**
 * Created by yangbo on 2017/7/13.
 */
public class Solution_83 {

    public static void main(String[] a) {
        ListNode nodes = new ListNode(-3);
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);

        nodes.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = nodes;

        Solution_83 sulotion_83 = new Solution_83();
//        ListNode result = sulotion_83.deleteDuplicates(node);
//        ListNode result = sulotion_83.deleteNode(node, 2);
        boolean isCycle = sulotion_83.hasCycle(node);
        System.out.println(">>>>"+isCycle);


//        int value = 121;
        int value = -2147483648;
        System.out.println("isPalindrome>>>>"+sulotion_83.isPalindrome(value));

//        LinkedListUtils.printLinkedList(result);
    }
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }
        ArrayList<ListNode> listNodes = new ArrayList<>();
        ListNode copyNode = head;
        while (copyNode!=null){
            listNodes.add(copyNode);
            copyNode = copyNode.next;
            if (copyNode==null){
                break;
            }
        }
        if (listNodes.size()<2){
            return true;
        }
        for (int i = 0; i < listNodes.size(); i++) {
            if (listNodes.get(i).val!=listNodes.get(listNodes.size()-1-i).val){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x) {

        int result = 0;

        int y = x;

        if (x<10){
            return true;
        }

        while (x>0){
            int currentValue = 0;
            currentValue = x%10;
            x = x/10;
            result = currentValue+result*10;
        }
        if (result!=y){
            return false;
        }
        return true;
    }


    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode prePoint = head;
        ListNode nextPoint = head;

        while (nextPoint!=null&&nextPoint.next!=null){
            nextPoint = nextPoint.next.next;
            prePoint =prePoint.next;
            if (nextPoint == prePoint){
                return true;
            }
        }
        return false;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {


        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode copyNode = head;

        while (copyNode != null) {
            ListNode currentNode = copyNode;
            ListNode nextNode = copyNode.next;
            if (nextNode == null) {
                break;
            }
            if (currentNode.val == nextNode.val) {
                copyNode.val = nextNode.val;
                copyNode.next = nextNode.next;
            } else {
                copyNode = copyNode.next;
            }
        }
        return head;
    }

    public ListNode deleteNode(ListNode head, int targetValue) {
        if (head == null) {
            return head;
        }
        ListNode copyNode = head;
        while (copyNode != null) {
            ListNode nextNode = copyNode.next;
            if (nextNode == null) {
                break;
            }
            if (copyNode.val == targetValue) {
                copyNode.next = nextNode.next;
            }
        }
        return head;
    }
}
