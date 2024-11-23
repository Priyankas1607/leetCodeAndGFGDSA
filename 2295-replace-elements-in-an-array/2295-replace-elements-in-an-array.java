class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int r = operations.length;
        int c = operations[0].length;
        
        // for(int i=0;i<r;i++){
        //     int j=0;
        //     for(int k=0;k<nums.length;k++){
        //         if(nums[k]==operations[i][j]){
        //         nums[k] = operations[i][j+1];
        //         break;
        //         }
        //     }
        // }
        // return nums;

        HashMap<Integer,Integer> mp = new HashMap<>();
         for(int k=0;k<nums.length;k++){
            mp.put(nums[k],k);
         }
        for(int i=0;i<r;i++){
            int index = mp.get(operations[i][0]);
            nums[index] = operations[i][1];
            mp.remove(operations[i][0]);
            mp.put(nums[index],index);
            
        }
        return nums;

    }
}