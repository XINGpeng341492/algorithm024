package java0.arthmetic.week1;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 12:58 下午
 **/
public class MergeTwoListNode {

    class ListNode {
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


    public ListNode mergeTwoListNode (ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode sentinal = new ListNode(-1);
        sentinal.next = head;
        ListNode temp = sentinal;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;

        }
        temp.next = l1 == null ? l2 : l1;
        return head;
    }



}
