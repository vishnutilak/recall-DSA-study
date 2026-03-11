#User function Template for python3

class Solution:
    def evenlyDivides(self, n):
        # code here
        count = 0
        
        for digit in str(n):
            d= int(digit)
            if d!=0 and n%d==0:
                count+=1
        return count

