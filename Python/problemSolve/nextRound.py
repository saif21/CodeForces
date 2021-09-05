class Solution:
    def nextRound(self, i, j, arr):
        lst = arr[j-1]
        count = 0
        for k in range(i):
            if arr[k] > 0 and arr[k] >= lst:
                count += 1
        return count


if __name__ == '__main__':
    i, j = map(int, input().split())
    arr = list(map(int, input().strip().split()))[:i]
    sol = Solution()
    print(sol.nextRound(i, j, arr))
