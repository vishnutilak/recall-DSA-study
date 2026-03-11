// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n = arr.length+1;
        
        int xor1=0, xor2=0;
        
        for(int i=1; i<=n; i++){
            xor1^=i;
        }
        for (int num: arr){
            xor2^= num;
        }
        return xor1^xor2;
    }
}
