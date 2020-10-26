#HACKER RANK SALES BY MATCH SOLUTION

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    count = 0
    for i in range(max(ar)+1):
        pairs = ar.count(i)/2
        x = math.trunc(pairs)
        count = count + x
    return count

#test input
n = 9
colours = [10, 20,20, 10, 10, 30, 50, 10, 20]
print(sockMerchant(n,colours))
