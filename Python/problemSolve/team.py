class Solution:
    def team(self, n, m, o):
        if (n+m+o) >= 2:
            return 1
        else:
            return 0


if __name__ == '__main__':
    i = int(input())
    count = 0
    # n, m, a = map(int, input().split())
    sol = Solution()
    for j in range(i):
        n, m, a = map(int, input().split())
        count += sol.team(n, m, a)
    print(count)
