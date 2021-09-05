def removeElement(s, target):
    i = 0
    length = len(s)
    while i < length:
        if s[i] == target:
            # print(s.pop(i))
            length -= 1
        else:
            i += 1
    return i+1


s = [1, 2, 2, 3, 3, 5, 6, 7, 8]
print(removeElement(s, 3))

'''
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:
Input: haystack = "", needle = ""
Output: 0
'''


def strStr(haystack, needle):
    if haystack and needle is None:
        return 0
    if needle in haystack:
        return haystack.index(needle)
    else:
        return -1


'''
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0

Example 5:
Input: nums = [1], target = 0
Output: 0
'''


def targetFound(nums, target):
    if target in nums:
        return nums.index(target)

    for i, v in enumerate(nums):
        if v > target:
            return i
        elif nums[len(nums)-1] < target:
            return len(nums)


print(targetFound([1, 3, 5, 6], 0))
