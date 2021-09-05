class Solution:
    def twoSum(self, nums, target):
        num_arr = [(x, index) for index, x in enumerate(nums)]
        start = 0
        end = len(nums)-1
        while start < end:
            curr_target = num_arr[start][0]+num_arr[end][0]
            if curr_target == target:
                return [num_arr[start][1], num_arr[end][1]]
            elif curr_target < target:
                start += 1
            else:
                end -= 1
        # start = 0
        # end = len(nums)-1
        # while start < end:
        #     for i in range(start+1, len(nums)):
        #         if nums[start]+nums[i+1] == target:
        #             return [start, i]

        #         start += 1
        #         self.twoSum(nums[start:], target)
                # el = nums[start]
                # new_arr = nums[start:]
                # # print(new_arr)
                # for i in range(start+1, len(new_arr)):
                #     if el+nums[i] == target:
                #         return [start, i]
                # start += 1


sol = Solution()
nums = [1, 2, 3, 4, 5, 6, 9]
target = 12
print(sol.twoSum(nums, target))


def first():
    second()
    print('first')


def second():
    third()
    print('second')


def third():
    fourth()
    print('third')


def fourth():
    print('fourth')


print(first())
