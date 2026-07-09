// Last updated: 7/9/2026, 9:14:34 AM
class Solution {
    public boolean checkStraightLine(int[][] crd) {
    int x1=crd[0][0] ,y1=crd[0][1];
    int x2=crd[1][0] ,y2=crd[1][1];   
    int dx=x2-x1,dy=y2-y1;
    for(int i=2;i<crd.length;i++){
        int xi=crd[i][0];
        int yi=crd[i][1];
        if((xi-x1)*dy != (yi-y1)*dx){
            return false;
        }
        
    }
    return true;
    }
}