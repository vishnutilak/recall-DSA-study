#User function Template for python3
class Solution:
    def getSecondLargest(self, arr):
        if len(arr)<2:
            return -1
        big, bigger = float('-inf'),float('-inf')
        
        for num in arr:
            if num>bigger:
                big= bigger
                bigger = num
            elif bigger>num> big:
                big= num
        
        return big if big!=float('-inf') else -1
