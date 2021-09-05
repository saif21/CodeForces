from itertools import product


def letterCombinations(digits):
    d = {}
    d["2"] = ["a", "b", "c"]
    d["3"] = ["d", "e", "f"]
    d["4"] = ["g", "h", "i"]
    d["5"] = ["j", "k", "l"]
    d["6"] = ["m", "n", "o"]
    d["7"] = ["p", "q", "r", "s"]
    d["8"] = ["t", "u", "v"]
    d["9"] = ["w", "x", "y", "z"]

    if len(digits) > 1:
        digits = list(digits)
        if len(digits) == 2:
            list1 = d[digits[0]]
            list2 = d[digits[1]]
            res = [[i, j] for i in list1
                   for j in list2]
            ans = []
            for r in res:
                r = ''.join(r)
                ans.append(r)
            return ans

        elif len(digits) == 3:
            list1 = d[digits[0]]
            list2 = d[digits[1]]
            list3 = d[digits[2]]
            res = [[i, j, k] for i in list1
                   for j in list2
                   for k in list3]
            ans = []
            for r in res:
                r = ''.join(r)
                ans.append(r)
            return ans
        elif len(digits) == 4:
            list1 = d[digits[0]]
            list2 = d[digits[1]]
            list3 = d[digits[2]]
            list4 = d[digits[3]]
            res = [[i, j, k, l] for i in list1
                   for j in list2
                   for k in list3
                   for l in list4]
            ans = []
            for r in res:
                r = ''.join(r)
                ans.append(r)
            return ans
    elif len(digits) == 1:
        return d[digits]
    else:
        ans = []
        return ans


print(letterCombinations(''))
print(','.join('abc'))


def letterCombinations(digits):
    if not digits:
        return []

    digit_to_letters = {"2": "abc", "3": "def", "4": "ghi",
                        "5": "jkl", "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz"}
    possible_letters = [digit_to_letters[d] for d in digits]
    return [''.join(tup) for tup in product(*possible_letters)]


print(letterCombinations('239'))
