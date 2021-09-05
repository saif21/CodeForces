import math
d = [3, 5]
# print(''.join(str(x) for x in d))


def plusOne(digits):
    sm = ''.join(str(x)for x in digits)
    sm = int(sm)+1
    return[int(x) for x in str(sm)]


digits = [9]
print(plusOne(digits))


def climbStairs(n):
    # using binets formula
    return round((pow((1+math.sqrt(5))/2, n+1))/math.sqrt(5))


# print(climbStairs(5))


def climbStairs(n):
    steps = [1, 1]+[-1 for _ in range(2, n+1)]
    print(steps)
    for step in range(2, n+1):
        steps[step] = steps[step-1]+steps[step-2]
    return steps[-1]


print(climbStairs(5))

# remove duplicate element from singly linkedlist


class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


class Solution:
    def removeDuplicates(self, head):
        current = head
        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next
        return head.val


l = [Node(x) for x in [1, 1, 2, 3, 5]]

s = Solution()


print([s.removeDuplicates(x) for x in l])

# marge two sorted array-88


def mergeArrays(nums1, m, nums2, n):
    last = m+n-1
    while m > 0 and n > 0:
        if nums1[m-1] > nums2[n-1]:
            nums1[last] = nums1[m-1]
            m -= 1
        else:
            nums1[last] = nums2[n-1]
            n -= 1
        last -= 1
    while n > 0:
        nums1[last] = nums2[n-1]
        n, last = n-1, last-1
    return nums1


a = [4, 5, 6, 0, 0, 0]
m = 3
b = [1, 2, 3]
n = 3
print(mergeArrays(a, m, b, n))

# for i in range(5, -1, -1):
#     print(i)
