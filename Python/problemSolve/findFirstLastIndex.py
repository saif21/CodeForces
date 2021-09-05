def findFirstLastIndex(nums, target):
    # new = []
    # l.sort()
    # for i, j in enumerate(l):
    #     if j == target:
    #         new.append(i)
    # return [new[0], new[-1]]
    if target not in nums:
        return [-1, -1]
    # find the 1st position, then reverse and subtract position from list len
    else:
        return([nums.index(target), len(nums) - sorted(nums, reverse=True).index(target) - 1])


print(findFirstLastIndex([5, 7, 7, 8, 8, 10], 8))


def missingNumberFromArray(nums):
    # nums.sort()
    # for i in range(len(nums)+1):
    #     if i not in nums:
    #         return i
    # another solution
    numsSum = sum(nums)
    n = len(nums)
    total = (0 + n) * (n + 1) // 2
    return total - numsSum


print(missingNumberFromArray([9, 6, 4, 2, 3, 5, 7, 0, 1]))


def countPrimes(n):
    # prime = []
    # for num in range(2, n):
    #     p = True
    #     for i in range(2, num):
    #         if num % i == 0:
    #             p = False
    #     if p:
    #         prime.append(num)
    # return prime
    is_prime = [0, 0] + [1 for _ in range(2, n)]
    for i in range(n):
        # if i-th int is prime,
        # then all its multiples are not prime
        if is_prime[i]:
            # start from i*i, as other mutliples of i would have been covered
            # by numbers smaller than i
            for j in range(i*i, n, i):
                is_prime[j] = 0

    return sum(is_prime)


print(countPrimes(10))
