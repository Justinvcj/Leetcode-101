// Last updated: 7/9/2026, 9:15:58 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer>freq=new HashMap<>();

    for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
    }
    List<Integer>[]bucket=new ArrayList[nums.length+1];

    for(int key:freq.keySet()){
        int count=freq.get(key);
        if(bucket[count]==null){
            bucket[count]=new ArrayList<>();
            
        }
        bucket[count].add(key);

    }
        int [] result=new int[k];
        int idx=0;

        for(int i=bucket.length-1;i>=0 && idx<k;i--)
        {
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    result[idx++]=num;
                    if(idx==k){
                        break;
                    }
                }
            }
              
        }

    return result;

    
    }
}