

def fotball(s):
    res = 1
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            res += 1
            if res >= 7:
                return "YES"
        else:
            res = 0
    return "NO"


print(fotball(s))

# correct ans;


def foootball(s):
    if s.count("1111111") > 0 or s.count("0000000") > 0:
        return "YES"
    return "NO"


s = input()
print(foootball(s))
