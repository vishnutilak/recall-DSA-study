
class Solution:
    def decodedString(self, s):
        # code here
        Stack =[]
        curr_num =0
        curr_str=""
        
        for char in s:
            if char.isdigit():
                curr_num= curr_num*10 +int(char)
            elif char=='[':
                Stack.append((curr_str,curr_num))
                curr_str,curr_num= "",0
            elif char==']':
                prev_str, num = Stack.pop()
                curr_str = prev_str+ num*curr_str
            else:
                curr_str+=char
        return curr_str

