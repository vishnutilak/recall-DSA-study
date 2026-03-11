



// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if (arr.length<2) return -1;
        
        int big = Integer.MIN_VALUE, bigger = Integer.MIN_VALUE;
        
        for (int num: arr){
            if (num>bigger){
                big= bigger;
                bigger= num;
            }
            else if ( big <num && num < bigger){
                big= num;
            }
        }
        return (big!= Integer.MIN_VALUE)?big: -1;
    }
}
