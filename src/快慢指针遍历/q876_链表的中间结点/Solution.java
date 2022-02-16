package ����ָ�����.q876_������м���;

/**
 * ����ָ�뷨 o(n)
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
