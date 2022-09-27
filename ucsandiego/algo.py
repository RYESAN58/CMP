from math import prod
from tokenize import Double


x = []

#find a 6 digit number who's first 3 digits are 100 and is divisable by 9127
def nine_one_two_seven():
    for i in range(10000):
        if i * 9127 > 1000000:
            return x
        elif i * 9127 > 100000 and i * 9127 < 101000:
            x.append(i*9127)

print(nine_one_two_seven())


# find a number where if divided by 2,3,4,5,6,7 it will have 1 as the remainder
def product():
    x = []
    for i in range(99,1000):
      if i%2 == 1 and i%3 == 1 and i%4 == 1 and i%5 == 1 and i%6 == 1 and i%7 == 1:
          x.append(i)
    return x

print(product())

# find a number where when its squared the first 5 digits = 31415

def squared():
    x=[]


squared()


def product2():
    x = []
    for i in range(0,100):
      if i%3 == 2 and i%4 == 3 and i%5 == 4:
          x.append(i)
    return x

print(product2())

def isnt_hundred():
    count = 0
    for i in range(10, 100):
        for x in range(i,100):
            if i+x == 100 and i !=x:
                count += 1
    return 90-count



print(isnt_hundred())
# Choose the maximal number of integers among 1..50 that can be selected if we are not allowed to select n and 2n at at same time.

def no_doubles():
    x = []
    y=[]
    doubles = []
    for i in range(1,51):
        x.append(i)
    for i in x:
        if i not in doubles:
            y.append(i)
            doubles.append(2*i)
    return y 

print(no_doubles())

#recusive functions

def factorial(x):
    if x == 1:
      return x
    else:
        return x * factorial(x-1)

print(factorial(5))

#Change can be made

def changer(change):
    if change == 8:
        return [3,5]
    if change == 9:
        return [3,3,3]
    if change == 10:
        return [5,5]
    answer= changer(change-3)
    answer.append(3)
    return answer

print(changer(3))