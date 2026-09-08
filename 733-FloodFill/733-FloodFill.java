// Last updated: 9/8/2026, 9:39:26 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
3    {
4    int og=image[sr][sc];
5
6        if(og==color)
7        {
8            return image;
9        }
10            dfs(image,sr,sc,og,color);
11            
12                return image;
13            
14
15    }
16    void dfs(int [][]image,int row,int col,int og,int color){
17
18        if(row<0 || row>=image.length||col<0||col>=image[0].length){
19            return;
20        }
21        if(image[row][col]!=og){
22            return;
23        }
24        image[row][col]=color;
25
26        dfs(image,row-1,col,og,color);
27        dfs(image,row+1,col,og,color);
28        dfs(image,row,col-1,og,color);
29        dfs(image,row,col+1,og,color);
30    }
31}