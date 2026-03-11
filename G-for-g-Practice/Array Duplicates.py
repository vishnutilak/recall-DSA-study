
class Solution:
    def findDuplicates(self, arr):
        # code here
        result, seen = set(), set()
        
        for num in arr:
            if num in seen:
                result.add(num)
            seen.add(num)
            
        return list(result)


