package merge_to_sorted_list;

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return dummyNode.next;
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode list3 = new ListNode();
        ListNode list4 = new ListNode();
        ListNode list5 = new ListNode();
        ListNode list6 = new ListNode();
        list1.val = 1;
        list2.val = 2;
        list3.val = 4;
        list4.val = 1;
        list5.val = 3;
        list6.val = 4;
        list1.next = list2;
        list2.next = list3;
        list4.next = list5;
        list5.next = list6;
        ListNode current = mergeTwoLists(list1, list4);
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }
}