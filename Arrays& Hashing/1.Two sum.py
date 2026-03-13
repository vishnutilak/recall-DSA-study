class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        previous ={}
        for j,num in enumerate(nums):
            #nums[i]+nums[j] = target
            if target-nums[j] in previous:
                return (previous[target-nums[j]], j)
            previous[num]=j
        return[]
