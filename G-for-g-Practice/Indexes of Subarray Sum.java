




class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left =0, currSum=0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int right= 0; right<arr.length; right++){
            currSum+= arr[right];
            
            while(currSum > target && left <right){
                currSum-= arr[left];
                left++;
            }
            if (currSum==target){
                result.add(left+1);
                result.add(right+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
