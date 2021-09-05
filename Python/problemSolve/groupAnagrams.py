import itertools
from collections import Counter


def groupAnagrams(s_list):
    h = {}
    for i in s_list:
        sorts = "".join(sorted(i))
        if sorts not in h:
            h[sorts] = []
        h[sorts].append(i)
    anag = []
    for i in h.values():
        anag.append(i)
    return anag


strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(groupAnagrams(strs))


def fourSum(a, b, c, d):
    h = {}
    ans = 0
    for i in range(0, len(a)):
        x = a[i]
        for j in range(0, len(b)):
            y = b[j]
            if (x+y) not in h:
                h[x+y] = 0
            h[x+y] += 1
    print(h)
    for i in range(0, len(c)):
        x = c[i]
        for j in range(0, len(d)):
            y = d[j]
            target = -(x+y)
            if target in h:
                ans += h[target]
    return ans


def fourSum2(a, b, c, d):
    target = Counter([-(x+y) for x, y in itertools.product(c, d)])
    vals = Counter([(x+y) for x, y in itertools.product(a, b)])
    print(target, vals)
    ans = 0
    for key in vals:
        ans += vals[key]*target[key]
    return ans


a = [1, 2]
b = [-2, -1]
c = [-1, 2]
d = [0, 2]
print(fourSum(a, b, c, d))
print(fourSum2(a, b, c, d))
