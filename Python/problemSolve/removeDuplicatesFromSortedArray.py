class Solution:
    def removeDuplicates(self, nums):
        # j = sorted(li)
        # print(len(j))
        # new_list = []
        # for i in j:
        #     if i not in new_list:
        #         new_list.append(i)
        # print(len(new_list))
        # while len(new_list) != len(j):
        #     new_list.append('_')
        # return new_list
        if len(nums) == 0:
            return 0
        left = 0
        for i in range(1, len(nums)):
            if nums[left] == nums[i]:
                continue
            else:
                left += 1
                # nums[left] = nums[i]
        print(nums)
        return left + 1


sol = Solution()
li = [3, 5, 4, 5, 5, 5]
print(sol.removeDuplicates(li))
