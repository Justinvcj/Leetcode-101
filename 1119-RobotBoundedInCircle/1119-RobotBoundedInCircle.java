// Last updated: 7/9/2026, 9:14:42 AM
class Solution {
    public boolean isRobotBounded(String instructions) {
    int x=0, y=0;
    int dir=0;
    int [][] direction={{0,1}, {1,0}, {0,-1}, {-1,0}};

    for(char c : instructions.toCharArray()){
        if(c=='G'){
            x+=direction[dir][0];
            y+=direction[dir][1];

        }
        else if(c=='L'){
            dir=(dir+3)%4;
        }
        else if(c=='R'){
            dir=(dir+1)%4;
        }
    }
    return ((x==0 && y==0) ||(dir !=0)); 
    }
}