package list_reverse;

import java.util.*;


public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = null;
        ListNode curr = head;
        while (curr.next != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println(curr.val);
        head = reverseList(head);
        curr = head;
        while (curr.next != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println(curr.val);
    }
}
