'''
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
'''


class Solution:
    def longestPalindrome(self, string):
        res = ''
        resLen = 0
        for i in range(len(string)):
          # for odd length
            left, right = i, i
            while left >= 0 and right < len(string) and string[left] == string[right]:
                if (right-left+1) > resLen:
                    res = string[left:right+1]
                    resLen = right-left+1
                left -= 1
                right += 1
          # for even length
            left, right = i, i+1
            while left >= 0 and right < len(string) and string[left] == string[right]:
                if (right-left+1) > resLen:
                    res = string[left:right+1]
                    resLen = right-left+1
                left -= 1
                right += 1
        return res


sol = Solution()
print(sol.longestPalindrome('babad'))
