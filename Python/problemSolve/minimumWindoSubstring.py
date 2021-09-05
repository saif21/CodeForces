from collections import Counter, deque


def minimumWindowSubstring(s, target):
    len1 = len(s)
    len2 = len(target)
    if len1 < len2:
        return ''

    hashStr, hashPtr = {}, {}
    for i in target:
        if i not in hashPtr:
            hashPtr[i] = 0
        hashPtr[i] += 1

    count, left = 0, 0
    startIndex = -1
    minLen = float('inf')


t = 'aabcad'

print(h)


'''
target_h = Counter(target)
    h = {}
    window = ''
    counter = 0
    l = 0
    r = 0
    while l < (len(s)-len(target)) and r < len(s):
        for i in s:
            if i not in h:
                h[i] = 1
                counter += 1
            h[i] += 1
            counter += 1
            if counter == len(target):
                for i in h.keys():
                    if h[i] == target_h[i]:
                        window += 'i'*h[i]
'''
