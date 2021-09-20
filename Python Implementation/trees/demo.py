def reverse(x):
    """
    :type x: int
    :rtype: int
    """
    if x < 0:
        x = '-' + str(x)[-1:0:-1]
    else:
        x = str(x)[::-1]
    x = int(x)
    if x < -2 ** 31 or x > 2 ** 31 - 1:
        return 0
    return x

print(reverse(-123))