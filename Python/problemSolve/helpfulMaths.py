def helpfulMath(s):
    if len(s) == 1:
        return s
    s = list(i for i in s if i != "+")
    return "+".join(i for i in sorted(s))


s = input()
print(helpfulMath(s))
