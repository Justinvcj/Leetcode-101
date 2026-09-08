// Last updated: 9/8/2026, 9:59:41 AM
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