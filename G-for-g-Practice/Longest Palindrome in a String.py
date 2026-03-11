class Solution:
    def __init__ (self):
        self.start=0
        self.max_length=0
    
    def longestPalindrome(self, s: str) -> str:
        if not s or len(s)==1:
            return s
        
        for i in range (len(s)):
            self.startMiddle(s,i,i)
            self.startMiddle(s,i,i+1)
        
        return s[self.start: self.start +self.max_length]

    def startMiddle(self, s:str, left:int, right: int):
        while left>=0 and right <len(s) and s[left]==s[right]:
            if right-left+1 > self.max_length:
                self.start =left
                self.max_length =right-left+1
            left-=1
            right+=1    
