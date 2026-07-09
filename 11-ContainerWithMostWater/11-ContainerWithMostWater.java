// Last updated: 7/9/2026, 9:17:48 AM
class Solution {
    public int maxArea(int[] height) {

    int left=0;
    int right=height.length-1;
    int max=0;

    while(left<right){
        int h=Math.min(height[left],height[right]);

        int width=right-left;
        int area=h*width;

        max=Math.max(max,area);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    } 
    return max;  
    }
}