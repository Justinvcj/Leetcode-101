// Last updated: 7/9/2026, 9:16:35 AM
class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2]; 
    }
}