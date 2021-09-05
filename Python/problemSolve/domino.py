class Solution:
    def domino(self, x, y):
        return (x*y)//2


if __name__ == '__main__':
    x, y = map(int, input().split())
    sol = Solution()
    print(sol.domino(x, y))
