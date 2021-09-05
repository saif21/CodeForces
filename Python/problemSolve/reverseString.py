def reverseString(s):
    n = len(s)
    start = 0
    end = n-1
    while start < end:
        s[start], s[end] = s[end], s[start]
        start += 1
        end -= 1
    return ''.join(s)


print(reverseString(['s', 'a', 'b']))
print(list('saif'))

