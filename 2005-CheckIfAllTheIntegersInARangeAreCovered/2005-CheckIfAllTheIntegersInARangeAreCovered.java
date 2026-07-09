// Last updated: 7/9/2026, 9:14:09 AM
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

    for(int i=left;i<=right;i++){
        boolean covered=false;

        for(int [] range : ranges){
            if(i>=range[0] && i<=range[1]){
                covered =true;
                break;
            }
        }
        if(!covered ){
            return false;
        }
    } 
    return true;  
    }
}