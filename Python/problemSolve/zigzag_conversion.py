'''
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"
'''


class Solution:
    def zigZagConversion(self, string, n):
        if len(string) == n:
            return string
        elif n == 1:
            return string
        elif len(string) < n:
            return string
        l = len(string)
        arr = ['' for x in range(l)]
        row = 0
        for i in range(l):
            arr[row] += string[i]
            if row == n-1:
                down = False
            elif row == 0:
                down = True
            if down:
                row += 1
            else:
                row -= 1
        print(arr)
        s = ''
        for i in range(n):
            s += arr[i]
        return s


sol = Solution()
print(sol.zigZagConversion('a', 3))
# 01859593251


def zigzagConversion(string, n):
    if len(string) == n:
        return string
    elif n == 1:
        return string
    elif len(string) < n:
        return string
    delta = -1
    row = 0
    res = [[] for x in range(n)]
    for i in string:
        res[row].append(i)
        if row == 0 or row == n-1:
            delta *= -1
        row += delta
    for i in range(len(res)):
        res[i] = ''.join(res[i])
    return ''.join(res)


print(zigzagConversion('saifhasanolive', 3))
