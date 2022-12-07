"""
Author: Grant Commodore

This program creates a list of 32 random numbers. The list is printed along with the sum, 
the average, the minimum, and the maximum, and a sorted version.
"""

import random

# Create a list of 32 random numbers.
def get_random_nums():
    random_nums = []
    for i in range(32):
        random_nums.append(random.randint(1, 100))
    return random_nums

# Compute the sum of a list of numbers.
def get_sum(nums):
    sum = 0
    for i in nums:
        sum += i
    return sum

#Compute the average of a list of numbers.
def get_average(nums):
    sum = 0
    for i in nums:
        sum += i
    average = sum / len(nums)
    return average

# Determine the minimum of a list of numbers.
def get_minimum(random_nums):
    minimum = min(random_nums)
    return minimum

# Determine the maximum of a list of numbers.
def get_maximum(random_nums):
    maximum = max(random_nums)
    return maximum

# Get the sorted version of a list.
def get_sort(nums):
    nums.sort()
    return nums


def main():
    # Get the random numbers.
    nums = get_random_nums()
    print("")
    print("The random numbers are:", nums)
    print("")

    # Get the sum of the random numbers.
    sum = get_sum(nums)
    print("The sum of the random numbers list is:", sum)

    # Get the average of the random numbers.
    average = get_average(nums)
    print("The average of the random numbers list is:", average)

    # Get the minimum of the random numbers.
    minimum = get_minimum(nums)
    print("The minimum of the random numbers list is:", minimum)

    # Get the maximum of the random numbers.
    maximum = get_maximum(nums)
    print("The maximum of the random numbers list is:", maximum)
    print("")

    # Get the sorted version of the random numbers.
    sort = get_sort(nums)
    print("The sorted version of the random numbers list is:", sort)
    print("")

main()