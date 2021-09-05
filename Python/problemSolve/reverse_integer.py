'''
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
'''


class Solution:
    def reverseInteger(self, x):
        self.x = int(x)
        sign = -1 if x < 0 else 1  # preserve the sign first
        x *= sign

        # eliminated leading zero in the reversed integer
        while x:
            if x % 10 == 0:
                x /= 10
            else:
                break

        # string manipulation
        x = str(x)
        lst = list(x)  # list('123') returns ['1', '2', '3']
        lst.reverse()
        x = "".join(lst)
        x = int(x)
        return sign*x


sol = Solution()
print(sol.reverseInteger(-21))


def reverseint(x):
    if x > (2**31)-1 or x < (-2**31):
        return 0
    if x > 0:
        x = str(x)[::-1]
    if x < 0:
        x = str(-x)[::-1]
        x = '-'+x
    if x[0] == 0:
        x = x[0:]
    x = int(x)
    if x > (2**31)-1 or x < (-2**31):
        return 0
    return x


print(reverseint(-100))
