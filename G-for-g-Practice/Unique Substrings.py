#User function Template for python3

class Solution:
    def unique_substring(self,s):
        #code here
        uniqueSs =set()
        for i in range (len(s)):
            for j in range (i+1, len(s)+1):
                uniqueSs.add(s[i:j])
        return len(uniqueSs)


