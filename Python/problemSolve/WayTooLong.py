class Solution:
    def convert(self, s):
        if len(s) > 10:
            return s[0]+str(len(s)-2)+s[-1]
        else:
            return s


if __name__ == '__main__':
    n = int(input())
    i = 0
    sol = Solution()
    if n >= 1 and n <= 100:
        while(i < n):
            s = input()
            print(sol.convert(s))
            i += 1
