package �������.q206_��ת����.f1;

/**
 * ����ֱ�ӷ����޸�nextָ�� o(n)
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre  = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode t = temp.next;
            temp.next = pre;
            pre = temp;
            temp = t;
        }
        return pre;
    }
}
