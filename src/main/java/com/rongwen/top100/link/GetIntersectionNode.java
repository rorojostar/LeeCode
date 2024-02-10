package com.rongwen.top100.link;

import com.rongwen.top100.link.node.ListNode;

public class GetIntersectionNode {
    /**
     * 160. 相交链表
     * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA, B = headB;

        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;

    }
}
