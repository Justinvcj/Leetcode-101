// Last updated: 9/8/2026, 2:58:05 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3    Queue<int []>queue=new LinkedList<>();
4    int fresh=0;
5
6    for(int row=0;row<grid.length;row++){
7        for(int col=0;col<grid[0].length;col++){
8            if(grid[row][col]==2){
9                queue.offer(new int[]{row,col});
10            }else if(grid[row][col]==1){
11                fresh++;
12            }
13        }
14    }
15    int minutes=0;
16    while(!queue.isEmpty() && fresh>0){
17        int size=queue.size();
18
19        for(int i=0;i<size;i++){
20            int [] current = queue.poll();
21            int row=current[0];
22            int col=current[1];
23
24            int newRow=row-1;
25            int newCol=col;
26            //UP
27            if(newRow>=0 && grid[newRow][newCol]==1){
28               grid[newRow][newCol]=2;
29               fresh--;
30               queue.offer(new int [] {newRow,newCol}); 
31            }
32            //DOWN
33            newRow=row+1;
34            newCol=col;
35            if(newRow<grid.length && grid[newRow][newCol]==1){
36               grid[newRow][newCol]=2;
37               fresh--;
38               queue.offer(new int [] {newRow,newCol}); 
39            }
40            newRow=row;
41            newCol=col-1;            
42            //LEFT
43            if(newCol>=0 && grid[newRow][newCol]==1){
44               grid[newRow][newCol]=2;
45               fresh--;
46               queue.offer(new int [] {newRow,newCol}); 
47            }
48            newRow=row;
49            newCol=col+1;
50            //RIGHT
51            if(newCol<grid[0].length && grid[newRow][newCol]==1){
52               grid[newRow][newCol]=2;
53               fresh--;
54               queue.offer(new int [] {newRow,newCol}); 
55            }
56        }
57       
58
59        minutes++;
60        
61    }
62    return fresh==0 ? minutes : -1;
63    }
64}