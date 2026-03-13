class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;
        for(int j=0; j<nums.size(); j++){
            int complement = target-nums[j];
            if(mp.contains(complement)) return {mp[complement], j};
            mp[nums[j]]=j;
        }
        return {};
    }
};
