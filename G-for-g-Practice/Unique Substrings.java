

// User function Template for Java

class Solution {
    public static int unique_substring(String s) {
        // Your code here
        Set <String> uniqueSs = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            for(int j= i+1; j<=s.length(); j++){
                uniqueSs.add(s.substring(i,j));
            }
        }
        return uniqueSs.size();
    }
}
