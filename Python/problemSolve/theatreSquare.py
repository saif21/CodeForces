import math


class Solution:
    def square(self, n, m, a):
        return math.ceil(n/a)*math.ceil(m/a)


if __name__ == '__main__':
    n, m, a = map(int, input().split())
    sol = Solution()
    print(sol.square(n, m, a))
