


class Solution {
    static String decodeString(String s) {
        // code here
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String currStr ="";
        int currNum=0;
        
        for (char c: s.toCharArray()){
            if(Character.isDigit(c)){
                currNum= currNum * 10 + (c - '0');
            }
            else if (c=='['){
                numStack.push(currNum);
                strStack.push(currStr);
                currStr ="";
                currNum=0;
            }
            else if (c==']'){
                int num = numStack.pop();
                StringBuilder temp = new StringBuilder (strStack.pop());
                temp.append(currStr.repeat(num));
                currStr = temp.toString();
            }
            else{
                currStr+=c;
            }
        }
        return currStr;
    }
}
