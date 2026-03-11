class Solution:
    def leaders(self, arr):
        # code here
        max_From_Right= float('-inf')
        result = []
        
        for i in range(len(arr)-1, -1, -1):
            if arr[i]>=max_From_Right:
                result.append(arr[i])
                max_From_Right = arr[i]
        
        return result[::-1]
            
