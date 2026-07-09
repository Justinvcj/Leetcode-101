// Last updated: 7/9/2026, 9:15:29 AM
class Solution {
    public int compress(char[] chars) {
    int i=0;
    int index=0;

    while(i<chars.length){
        char current=chars[i];
        int count=0;

        while(i<chars.length && current==chars[i]){
            count++;
            i++;
        }
        chars[index++]=current;
        if(count>1){
            for(char c:Integer.toString(count).toCharArray()){
                chars[index++]=c;
            }
        }

    }
    return index;  
    }
}