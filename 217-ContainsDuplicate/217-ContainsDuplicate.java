// Last updated: 7/9/2026, 9:16:23 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer>map=new HashSet<>();

    for(int i=0;i<nums.length;i++){
        map.add(nums[i]);
    } 
    return nums.length!=map.size();  
    }
}