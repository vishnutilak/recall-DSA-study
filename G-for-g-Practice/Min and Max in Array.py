
#User function Template for python3
#User function Template for python3

class Solution:
    def get_min_max(self, arr):
        min = float('inf')
        max = float('-inf')
        for num in arr:
            if num<=min:
                min = num
            if num >max:
                max= num
        return [min,max]
    
