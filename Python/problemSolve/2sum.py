class Solution:
    def twoSum(self, nums, target):
        M = {}  # counter part number needed by index i: i

        for i, num in enumerate(nums):
            if num in M:
                return [M[num], i]
            M[target-num] = i
            print(M)

        return False


sol = Solution()
print(sol.twoSum([3, 2, 4], 6))
