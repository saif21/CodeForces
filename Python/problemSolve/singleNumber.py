'''
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
'''


from collections import Counter


def singleNumberFound(nums):
    unique_num = set(nums)
    num_sum = sum(nums)
    u_sum = 2*sum(unique_num)
    return u_sum-num_sum
    # return 2*sum(set(nums))-sum(nums)


print(singleNumberFound([2, 2, 1, 1, 4, 5, 4]))


def robotToOrigin(moves):
    # x, y = 0, 0
    # d = {}
    # for i in moves.upper():
    #     if i == 'U':
    #         y += 1
    #     elif i == 'D':
    #         y -= 1
    #     elif i == 'R':
    #         x += 1
    #     elif i == "L":
    #         x -= 1
    # if x == 0 and y == 0:
    #     return True
    # return False
    counts = Counter(moves)
    return counts.get('U', 0) == counts.get('D', 0) and counts.get('L', 0) == counts.get('R', 0)


print(robotToOrigin('LL'))


def addBinary(a, b):
    # result = []
    # i, j = len(a)-1, len(b)-1
    # carry = 0
    # while i >= 0 or j >= 0 or carry:
    #     total = carry
    #     if i >= 0:
    #         total += int(a[i])
    #         i -= 1
    #     if j >= 0:
    #         total += int(b[j])
    #         j -= 1
    #     result.append(str(total % 2))
    #     carry = total//2
    # return ''.join(reversed(result))
    return bin(int(a, 2)+int(b, 2))[2:]


print(addBinary('1101', '1001'))
'''
1101
1001
10110

'''
