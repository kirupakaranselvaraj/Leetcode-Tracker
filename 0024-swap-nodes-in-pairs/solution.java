class Solution {
    public ListNode swapPairs(ListNode h) {
        if (h == null || h.next == null) return h;
        ListNode t = h.next;
        h.next = swapPairs(t.next);
        t.next = h;
        return t;
    }
}
