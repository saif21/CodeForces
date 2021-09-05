class Solution:
    def bitPlus(self, s):
        if "+" in s:
            return 1
        elif "-" in s:
            return -1


if __name__ == "__main__":
    n = int(input())
    sol = Solution()
    sum = 0
    for i in range(n):
        s = input()
        sum += sol.bitPlus(s)
    print(sum)
