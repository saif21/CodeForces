class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        self.nums1 = nums1
        self.nums2 = nums2
        new_arr = sorted(self.nums1+self.nums2)
        # print(new_arr)
        if sum(new_arr) == 0:
            return f'{0:.5f}'
        elif len(new_arr) == 2:
            for i in new_arr:
                if i > 0:
                    return f'{i:.5f}'
        elif len(new_arr) % 2 == 0:
            l = len(new_arr)//2
            mean_arr = new_arr[l-1:l+1]

            mean = sum(x for x in mean_arr)
            med = mean/2
            return f"{med:.5f}"
        else:
            l = round(len(new_arr)/2)
            return new_arr[l-1]


nums1 = [int(x) for x in input().split(' ')]
nums2 = [int(x) for x in input().split(' ')]

med = Solution()
med.findMedianSortedArrays(nums1, nums2)
print(med.findMedianSortedArrays(nums1, nums2))
'''
TypeError: 2.00000 is not valid value for the expected return type double
    raise TypeError(str(ret) + " is not valid value for the expected return type double");
Line 57 in _driver (Solution.py)
    _driver()
Line 64 in <module> (Solution.py)
During handling of the above exception, another exception occurred:
TypeError: must be real number, not str
Line 18 in _serialize_float (./python3/__serializer__.py)
Line 61 in _serialize (./python3/__serializer__.py)
    out = ser._serialize(ret, 'double')
Line 55 in _driver (Solution.py)
'''
