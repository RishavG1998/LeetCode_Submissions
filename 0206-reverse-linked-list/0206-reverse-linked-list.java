/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 1M: Iterative
    public ListNode reverseList(ListNode head) {
        // ListNode newHead = null;
        // while (head != null) {
        //     ListNode next = head.next;
        //     head.next = newHead;
        //     newHead = head;
        //     head = next;
        // }
        // return newHead;

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // 2M: Recursive
    // public ListNode reverseList(ListNode head) {
    //     return recursiveReverse(head, null);
    // }

    // public ListNode recursiveReverse(ListNode head, ListNode newHead) {
    //     if (head == null) return newHead;

    //     ListNode next = head.next;
    //     head.next = newHead;
    //     return recursiveReverse(next, head);

    // }
}