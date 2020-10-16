#Binary search that works when an array is shifted
#Modified Binary Search
def function(array, key, low, high):
    #Find the mid value of the array
    mid = int((low + high) / 2)

    if(low>high):
        return(-1)
    #Checks if the middle number in the array is the key value
    if(array[mid] == key):
        return(mid)
    #Checks if the first element and the last element of the array is the key
    #value. If not then it checks one half for the array and then the other half.
    if(array[low]<=array[mid]):
        if((array[low] <= key) and (array[mid] >= key)):
            return function(array, key, low, mid-1)
        else:
            return function(array,key,mid+1,high)
    else:
        if(array[mid] <= key and array[high] >= key):
            return function(array, key,mid+1, high)
        else:
            return function(array, key, low, mid-1)

# Test Code
test_array = [5,9,10,1,4]
key = 1
low = 0
high = 4
print("key = {0} index = {1}".format(key, function(test_array, key, low, high)))
# print(function(test_array, key, low, high))
