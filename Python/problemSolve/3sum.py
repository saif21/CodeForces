'''
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that 
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []
'''


class Solution:
    def twoSum(self, nums):
        # if len(nums) == 0 or len(nums) == 1 and nums[0] == 0:
        #     return []
        nums.sort()
        res = []
        for i in range(len(nums)-2):
            if i == 0 or i > 0 and nums[i-1] != nums[i]:
                left = i+1
                right = len(nums)-1
                # print(left, right)
                while left < right:
                    s = nums[i]+nums[left]+nums[right]
                    if s == 0:
                        res.append([nums[i], nums[left], nums[right]])
                        left += 1
                        right -= 1
                        # print(left, right)
                        while left < right and nums[left] == nums[left-1]:
                            left += 1
                            # print(left)
                        while right > left and nums[right] == nums[right+1]:
                            right -= 1
                            # print(right)
                    elif s < 0:
                        left += 1
                        # print(left)
                    else:
                        right -= 1
                        # print(right)
        return res


sol = Solution()
print(sol.twoSum([-1, 0, 1, 2, -1, -4]))
