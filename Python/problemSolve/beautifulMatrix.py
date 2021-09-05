from functools import reduce
matrix = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 1], [
    0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
m1, m2, m3, m4, m5 = matrix[0], matrix[1], matrix[2], matrix[3], matrix[4]

print(matrix[1].count(1))

# count = 0
# for i, j in enumerate(matrix):
#     for k, l in enumerate(j):
#         if l == 1:
#             print(i, k)
#             matrix[i], matrix[2] = matrix[2], matrix[i]
#             count += 1
#             while(k != 2):
#                 k -= 1
#                 count += 1
#             print(count)


class Solution:

    def idx(self, matrix):
        for i, j in enumerate(matrix):
            for k, l in enumerate(j):
                if l == 1:
                    return i, k

    def swap(self, i, k):
        count = 0
        if i != 2:
            count += 1
        while k != 2:
            if k > 2:
                k -= 1
                count += 1
            elif k < 2:
                k += 1
                count += 1
        return count


# if __name__ == '__main__':
#     n, m = map(int, input().split())
#     # mtx = [[int(input()) for i in range(m)] for j in range(n)]
#     mtx = [map(int, input().split()) for _ in range(5)]
#     sol = Solution()
#     i, k = sol.idx(mtx)
#     print(sol.swap(i, k))


# n, m = map(int, input().split())
# mtx = [[int(input()) for i in range(m)] for j in range(n)]
# print(mtx)
# v = reduce(lambda x, y: x+y, matrix)
# print(v)

# def solution(matrix):
#     isNotOne = False
#     i = r = c = 0
#     while i < 5 and not isNotOne:
#         j = 0
#         while j < 5 and not isNotOne:
#             if matrix[i][j] == 1:
#                 r = i
#                 c = j
#                 isNotOne = True
#             j += 1
#         i += 1
#     return abs(r-2)+abs(c-2)


# if __name__ == '__main__':
#     # n, m = map(int, input().split())
#     # mtx = [[int(input()) for i in range(m)] for j in range(n)]
#     matrix = list()
#     for _ in range(0, 5):
#         matrix.append(input().split(" "))
#     print(solution(matrix))


matrix = []
for i in range(5):
    matrix.append([int(i) for i in input().split(' ')])
x, y = (0, 0)
for i in range(5):
    if matrix[i].count(1) > 0:
        x, y = (i, matrix[i].index(1))
print(abs(2-y)+abs(2-x))
