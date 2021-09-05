

class Solution:
    def threeSumClosest(self, nums, target):
        nums.sort()
        best_ans = sum(nums[:3])
        n = len(nums)
        for i in range(n-2):
            left = i+1
            right = n-1
            while left < right:
                s = nums[i]+nums[left]+nums[right]
                if abs(s-target) < abs(best_ans-target):
                    best_ans = s
                if s == target:
                    return s
                elif s < target:
                    left += 1
                else:
                    right -= 1

        return best_ans
        # nums.sort()
        # n = len(nums)
        # best_ans = sum(nums[:3])
        # for i in range(n-2):
        #     j = i+1
        #     k = n-1
        #     while j < k:
        #         curr_ans = nums[i] + nums[j] + nums[k]
        #         if abs(curr_ans-target) < abs(best_ans-target):
        #             best_ans = curr_ans
        #         if curr_ans == target:
        #             return curr_ans
        #         elif curr_ans < target:
        #             j += 1
        #         else:
        #             k -= 1
        # return best_ans


sol = Solution()
print(sol.threeSumClosest([-1, 2, 1, -4], 1))
