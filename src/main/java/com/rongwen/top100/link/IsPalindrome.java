package com.rongwen.top100.link;

import com.rongwen.top100.link.node.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    /**
     * 234. 回文链表
     * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        List<Integer> vals = new ArrayList<Integer>();
        int i = 0;
        while (cur != null) {
            vals.add(cur.val);
            cur = cur.next;
        }

        int front = 0, back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) return false;
            front++;
            back--;
        }
        return true;
    }
}
