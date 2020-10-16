

import math

#returns the index of the left child
def LEFT(i):
    return((2*i)+1)

#returns the index of the right child
def RIGHT(i):
    return((2*i)+2)

#returns the index of the parent
def PARENT(i):
    return math.floor(i / 2)

#The maximum node at the top of the heap
def HEAP_MAXIMUM(A):
    return A[0]

#takes a random array and returns the array as max heap
def BUILD_MAX_HEAP(A):
    n = len(A)
    for i in range (n,-1,-1):
        MAX_HEAPIFY(A,i, n)

#takes in an heap with one element out of place and returns it as
#max heap
def MAX_HEAPIFY(A,i,n):
    l = LEFT(i)
    r = RIGHT(i)

    if ((l < n) and (A[l] > A[i])):
        largest = l
    else:
        largest = i

    if ((r < n) and (A[r] > A[largest])):
        largest = r

    if (largest != i):
        A[i], A[largest] = A[largest], A[i] #swap!
        MAX_HEAPIFY(A,largest, n)

#sorts the array from min to max
def HEAPSORT(A):
    BUILD_MAX_HEAP(A)
    for i in range(len(A)-1,0,-1):
        A[1-1], A[i] = A[i], A[1-1] #swap!
#         BUILD_MAX_HEAP(A)
        MAX_HEAPIFY(A,1-1,i)

#removes the biggest elements from the max heap array and returns it
#while making sure the array is till a max heap
def HEAP_EXTRACT_MAX(A):
    if not A:
        print("Heap Underflow")
        return
    heap_size = len(A)

    max = A[0]
    A[0] = A[heap_size - 1]
    MAX_HEAPIFY(A, 0, heap_size)
    A.pop(heap_size-1)
    return max

#inserts a new element into the heap and makes sure the it remians as
#max heap
def MAX_HEAP_INSERT(A, key):
    A.append(key)
    heap_size = len(A)
    A[heap_size-1] = key
    i = heap_size-1
    while A[i] > A[PARENT(i)] and i > 1:
        temp = A[i]
        A[i] = A[PARENT(i)]
        A[PARENT(i)] = temp
        i = PARENT(i)
    MAX_HEAPIFY(A, 0, heap_size)

#Function will print the array in a side-ways tree
def printAsTree(A,i,depth):
    #Exit statement when printing tree is done.
    if i>=len(A):
        return

    depth+=1
    #Prints the appropiate spaces and number recursively.
    printAsTree(A,RIGHT(i),depth)
    for k in range(0,depth):
        print("   ",end="")
    print(A[i])
    printAsTree(A,LEFT(i),depth)

#Function prints the heap array
def printAsArray():
    print(A)

#Test Code
A = [10,2,8,1,9,16,4,14,3,7]
print("Arbitrary array ")
printAsArray()
print("Build Max Heap Function: ")
BUILD_MAX_HEAP(A)
printAsArray()

print("Max-Heapify: ")
printAsArray()

print("Heap Maximum: ")
print(HEAP_MAXIMUM(A))

print(" PRINT TREE")
depth=0
printAsTree(A,0,depth)
print("--------------------")

print("Heap Extract Max:")
print(HEAP_EXTRACT_MAX(A))

print("New Tree")
depth=0
printAsTree(A,0,depth)
print("--------------------")

print("Max Heap Insert:")
MAX_HEAP_INSERT(A,15)
print("New Tree")
depth=0
printAsTree(A,0,depth)
print("--------------------")

print("Heap Sort:")
B=[1,15,8,4,2,11,10,7,5,6]
print("Before")
BUILD_MAX_HEAP(A)
printAsArray()
print("After")
HEAPSORT(A)
printAsArray()
