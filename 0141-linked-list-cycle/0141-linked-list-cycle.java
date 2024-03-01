/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode nodeSlow = head;
        ListNode nodeFast = head;
        while (nodeFast != null && nodeFast.next != null) {
            nodeSlow = nodeSlow.next;
            nodeFast = nodeFast.next.next;
            if (nodeSlow == nodeFast) return true;
        }
        return false;
    }
}