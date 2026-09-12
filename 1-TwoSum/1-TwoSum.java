// Last updated: 9/12/2026, 9:29:46 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3    List<List<Integer>>list=new ArrayList<>();
4    Arrays.sort(nums);
5
6    for(int i=0;i<nums.length-2;i++){
7        if(i>0 && nums[i]==nums[i-1]) continue;
8
9        int left=i+1;
10        int right=nums.length-1;
11
12        while(left<right){
13            int total=nums[i]+nums[left]+nums[right];
14
15            if(total==0){
16                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
17
18                while(left<right && nums[left]==nums[left+1]){
19                    left++;
20                }
21                while(left<right && nums[right]==nums[right-1]){
22                    right--;
23                }
24                left++;
25                right--;
26            }else if(total<0){
27                left++;
28            }else{
29                right--;
30            }
31        }
32    } 
33    return list;   
34    }
35}