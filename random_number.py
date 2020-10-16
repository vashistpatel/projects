import random

first = 0
last = 5
number_of_rands = 10

for i in range(0,number_of_rands):
    print(random.randrange(first,last+1))
