package LeetCode.medium;

public class SwapNodesInPairs {
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

    public ListNode swapPairs(ListNode head) {
        ListNode ret = new ListNode();
        ListNode cur = ret;
        int reserved = -1;

        while (head != null) {
            if (reserved == -1) {
                reserved = head.val;
            } else {
                ListNode temp = new ListNode(head.val);
                cur.next = temp;  // 위에 만든 temp를 가리키게 한다
                cur = temp;   //cur의 위치를 옮긴다.
                temp = new ListNode(reserved);
                cur.next = temp;
                cur = temp;
                reserved = -1;

            }
            head = head.next;

        }
        if (reserved != -1) {
            ListNode temp = new ListNode(reserved);
            cur.next = temp;
            cur = temp;
        }
        return ret.next;
    }
}
