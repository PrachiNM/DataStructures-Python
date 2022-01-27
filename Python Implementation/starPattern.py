# *
# **
# ***
# ****
# *****
# ****
# ***
# **
# *
def print_stars_1(n):
    for i in range(1, 2*n):
        if i > n:
            print((2 * n - i) * '*')
        else:
            print('*' * i)


#     *
#    **
#   ***
#  ****
# *****
#  ****
#   ***
#    **
#     *
def print_stars_2(n):
    for i in range(1, 2*n):
        if i>n:
            print((i-n)*' ', (2*n-i)*'*')
        else:
            print((n-i)*' ', i*'*')


#     *
#    **
#   ***
#  ****
# *****
def print_stars_3(n):
    for i in range(1, n+1):
        print((n-i)*' ', (i*'*'))


#     *
#    ***
#   *****
#  *******
# *********
def print_stars_4(n):
    for i in range(n):
        print((n-i)*' ', (2*i+1)*'*')


#     *
#    * *
#   * * *
#  * * * *
# * * * * *
def print_stars_4(n):
    for i in range(n):
        print((n-i)*' ', (i+1)*'* ')


# *********
#  *******
#   *****
#    ***
#     *
def print_stars_5(n):
    for i in range(n, 0, -1):
        print((n-i)*' ', (2*i-1)*'*')

#     *
#    ***
#   *****
#  *******
# *********
#  *******
#   *****
#    ***
#     *
def print_stars_5(n):
    for i in range(2*n):
        if i > n:
            print((i-n)*' ', (2*(2*n-i)-1)*'*')
        else:
            print((n-i)*' ', (2*i-1)*'*')


print_stars_5(5)


