


class Solution {
    private int start, maxLength;
    
    public String longestPalindrome(String s) {
        if ((s==null)|| s.length()<1) return "";

        for (int i=0; i<s.length();i++){
            startMiddle(s,i,i);
            startMiddle(s,i,i+1);
        }
        return s.substring(start, start +maxLength);       
    }
    private void startMiddle(String s, int left, int right){
        while (left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
            if(right-left+1>maxLength){
                start= left;
                maxLength=right-left+1;
            }
            left--;
            right++;
        }
    }
}
