package com.training.algorithm.math;

import com.training.algorithm.linkedlist.ListNode;
import com.training.algorithm.tree.TreeNode;

import java.util.Stack;

import static java.awt.Color.white;
import static java.awt.SystemColor.info;

/**
 * Created by j-yangbo on 2017/4/14.
 * 2. Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Solution_2 {
    public static void main(String[] args) {

       /* ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        node.next = node1;
        node1.next = node2;

        ListNode nodes = new ListNode(5);
        ListNode nodes1 = new ListNode(6);
        ListNode nodes2 = new ListNode(4);
        nodes.next = nodes1;
        nodes1.next = nodes2;*/
       ListNode node = new ListNode(1);
       ListNode node1 = new ListNode(7);
       node.next = node1;
       ListNode nodes= new ListNode(1);

        Solution_2 solution = new Solution_2();

      solution.printListNode(  solution.addTwoNumbers(node, nodes));
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return new ListNode(0);
        }
        Stack<Integer> beforeStack = new Stack<>();
        Stack<Integer> afterStack = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        while (l1 != null) {
            beforeStack.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            afterStack.push(l2.val);
            l2 = l2.next;
        }
        int count = beforeStack.size() > afterStack.size() ? beforeStack.size() : afterStack.size();
        int leftShift = 0;
        for (int i = 0; i < count; i++) {
            int beforeNum = beforeStack.isEmpty() ? 0 : beforeStack.pop();
            int afterNum = afterStack.isEmpty() ? 0 : afterStack.pop();
            int sum = beforeNum + afterNum + leftShift;

            leftShift = 0;
            resultStack.push(sum % 10);
            leftShift = (sum > 9 ? sum / 10 : 0);

        }
        if (leftShift>0){
            resultStack.push(leftShift);
        }
       Stack<Integer> formatStack = new Stack<>();
        while (!resultStack.isEmpty()){
            formatStack.push(resultStack.pop());
        }

        return createListNode(formatStack);
    }

    private ListNode createListNode(Stack<Integer> stack){
         ListNode head =null;
         ListNode tail = null;
        while (!stack.isEmpty()) {
            if (head == null) {
                head = new ListNode(stack.pop());
                tail = head;
            } else {
                ListNode node = new ListNode(stack.pop());
                tail.next = node;
                tail = node;
            }

        }
        return head;
    }
    private void printListNode(ListNode node) {
        if (node == null) {
            System.out.println("Empty ListNode!!");
            return;
        }
        while (node != null) {
            System.out.println("" + node.val);
            node = node.next;
        }

    }
    private void printStack(Stack<Integer> stack){
        System.out.println("===========print stack start==============");
        if (stack == null||stack.isEmpty()) {
            return;
        }
        while (!stack.isEmpty()){
            System.out.println(""+stack.pop());
        }
        System.out.println("===========print stack endS==============");

    }

}
