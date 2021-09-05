'''
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true
'''


class Solution:
    def validParentheses(self, s):
        # s = list(s)
        # if len(s) % 2 != 0:
        #     return False
        # parentheses1 = ['(', '{', '[']
        # parentheses2 = [')', '}', ']']
        # for i in range(len(s)):
        #     print(i)
        #     if s[i] in parentheses1:
        #         print(s[i])
        #         id = parentheses1.index(s[i])
        #         print(parentheses1.index(s[i]))
        #         if s[(len(s)-1-i)] == parentheses2[id]:
        #             s.pop(i)
        #             self.validParentheses(s)
        #         else:
        #             print(s[-(len(s)-1-i)])
        #             return False
        pars = {
            ')': '(',
            '}': '{',
            ']': '['
        }
        stack = []
        for c in s:
            print(c)
            if c not in pars:
                stack.append(c)
            else:
                if stack:
                    print(stack)
                    if stack[-1] == pars[c]:
                        print(pars[c])
                        stack.pop()
                    else:
                        return False
                else:
                    return False
        if stack:
            return False
        return True


s = ["(){}[]"]
sol = Solution()
print(sol.validParentheses("{[]}"))
