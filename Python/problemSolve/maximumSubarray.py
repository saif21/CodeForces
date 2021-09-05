'''
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
'''


def maximumsubarray(nums):
    maxSum = nums[0]
    currentSum = maxSum
    for i in range(1, len(nums)):
        currentSum = max(nums[i]+currentSum, nums[i])
        maxSum = max(currentSum, maxSum)
    return maxSum


print(maximumsubarray([5, 4, -1, 7, 8]))

'''
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:
Input: s = " "
Output: 0
'''


def lengthOfLastWord(s):

    return len(s.strip().split(" ")[-1])


print(lengthOfLastWord(" "))


'''
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
'''


def sqrtx(x):
    low = 0
    high = x
    while low <= high:
        mid = low + (high - low) // 2
        if mid * mid == x:
            return mid
        elif mid * mid < x:
            ans = mid
            low = mid + 1
        else:
            high = mid - 1
    return ans
# alternate solution
# return int(math(sqrt(s)))


print(sqrtx(15))
