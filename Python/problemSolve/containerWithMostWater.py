'''
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Example 3:
Input: height = [4,3,2,1,4]
Output: 16

Example 4:
Input: height = [1,2,1]
Output: 2

'''


class Solution:
    def containerWithMostWater(self, height):
        start = 0
        end = len(height)-1
        max_area = 0
        while start < end:
            # min_area = min(height[start], height[end])
            # print(min_area)
            area = min(height[start], height[end])*(end-start)
            # print(area)
            max_area = max(area, max_area)
            if height[start] > height[end]:
                end -= 1
            else:
                start += 1
        return max_area


sol = Solution()
print(sol.containerWithMostWater([1, 1, 2]))
