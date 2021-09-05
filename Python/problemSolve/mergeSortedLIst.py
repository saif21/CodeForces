class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def mergeTwoSortedList(self, l1, l2):
        pre_head = ListNode(-1)
        curr = pre_head

        while l1 and l2:
            if l1.val < l2.val:
                curr.next = l1
                l1 = l1.next
            else:
                curr.next = l2
                l2 = l2.next
            curr = curr.next

        if l1:
            curr.next = l1
        if l2:
            curr.next = l2

        return pre_head.next


sol = Solution()
print(sol.mergeTwoSortedList([1, 2, 4], [1, 3, 4]))
