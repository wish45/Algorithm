package medium;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveNthNodeFromEndOfList {
    public class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        ListNode cur = head;
        while (cur != null) {
            lists.add(0, cur.val); // 역순으로 넣어준다.
            cur = cur.next;

        }
        lists.remove(n - 1);

        Collections.reverse(lists);
        ListNode ret = null;
        if (lists.size() >= 1) {
            ret = new ListNode();
            cur = ret;
            for (int i = 0; i < lists.size(); i++) {
                cur.val = lists.get(i);
                if (i < lists.size() - 1) { //끝에서 하나전까지만
                    cur.next = new ListNode();
                    cur = cur.next;
                }
            }
        }
        return ret;

    }
}

