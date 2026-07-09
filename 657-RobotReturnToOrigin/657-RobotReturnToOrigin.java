// Last updated: 7/9/2026, 9:15:07 AM
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0; 
        int y = 0; 

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'R') x++;
            else if (move == 'L') x--;
            else if (move == 'U') y++;
            else if (move == 'D') y--;
        }

        return x == 0 && y == 0;
    }
}
