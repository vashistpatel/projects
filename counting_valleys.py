#HACKER RANK COUNTING VALLEYS SOLUTION

#!/bin/python3

import math
import os
import random
import re
import sys
import numpy as np


def countingValleys(steps, path):
    # Write your code here
    valleys = 0
    tracker = 0
    prev_track = 0
    for i in range(len(path)):
        if(path[i]=='U'):
            tracker = tracker + 1
            prev_track = prev_track - 1
        if(path[i]=='D'):
            tracker = tracker - 1
            prev_track = tracker + 1
        if(tracker==-1 and (prev_track==0 or prev_track==1)):
            valleys = valleys + 1
    return valleys

# test input
steps = 8
path = np.array(['U','D','D','D','U','D','U','U'])
print(countingValleys(steps,path))
