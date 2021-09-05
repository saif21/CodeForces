'''
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
'''


class Solution:
    def longestCommonPrefix(self, string):
        if len(string) == 0 and string == None:
            return ''
        string.sort(key=len)
        first = string[0]
        for i in range(1, len(first)+1):
            common_prefix = first[:i]
            for j in string[1:]:
                if j[:i] != common_prefix:
                    return first[:i-1]
        return first


sol = Solution()
print(sol.longestCommonPrefix(["flower", "flow", "flight"]))
