def stonesOnTable(n, s):
    count = 0
    for i in range(1, n):
        if s[i-1] == s[i]:
            count += 1
    return count


n = int(input())
s = input()
print(stonesOnTable(n, s))
