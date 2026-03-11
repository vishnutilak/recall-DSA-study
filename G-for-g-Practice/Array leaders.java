

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        LinkedList<Integer> result = new LinkedList<>();
        int maxFromRight = Integer.MIN_VALUE;
        
        
        for(int i = arr.length-1; i>=0; i--){
            if (arr[i] >= maxFromRight){
                result.addFirst(arr[i]);
                maxFromRight = arr[i];
            }
        }

        return new ArrayList<>(result);
    }
}
