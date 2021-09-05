class Solution:
    def atoi(self, s):
        char = ['0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', '-', '+', '.']
        new_s = ''
        if s[0].isalpha():
            return 0
        else:
            for i in s:
                if i in char:
                    new_s += i
        if '.' in new_s:
            ind = new_s.index('.')
            if ind == 0:
                return 0
            new_s = new_s[0:ind]
        if int(new_s) > (2**31)-1:
            return (2**31)-1
        elif int(new_s) < (-2**31):
            return (-2**31)
        return int(new_s)

    def strToint(self, str):

        INT_MAX = 2147483647
        INT_MIN = -2147483648
        # clean
        str = str.strip()
        if not str:
            return 0

        # clean up leading sign
        sign = 1
        if str[0] in ("+", "-"):
            if str[0] == "-":
                sign = -1
            str = str[1:]

        # check for leading digit
        # if not str[0].isdigit():
        #     return 0

        for ind, val in enumerate(str):
            if not val.isdigit():
                str = str[:ind]
                break

        # convert char array to integer
        sum = 0
        scale = 1
        for element in str[::-1]:
            sum += scale*int(element)
            scale *= 10

        result = sign*sum
        if result > INT_MAX:
            return INT_MAX
        if result < INT_MIN:
            return INT_MIN
        return result


sol = Solution()
print(Solution().atoi(" .987"))
print(int('0042'))
print(sol.strToint("   -42"))
