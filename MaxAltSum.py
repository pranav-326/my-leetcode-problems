def maxAlternatingSum(nums):
    nums.sort(key=abs)
    j = len(nums) - 1
    i = 0
    sum = 0
    while j >= i:
        if i == j:
            sum += nums[j] ** 2
            j -= 1
            break
        sum += nums[j] ** 2
        j -= 1
        sum -= nums[i] ** 2
        i += 1
    return sum
print(maxAlternatingSum([1, 2, 3, 4]))