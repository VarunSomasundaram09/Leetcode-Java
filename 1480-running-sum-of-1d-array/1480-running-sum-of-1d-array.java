class Solution {
    public int[] runningSum(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int sum=0;
            sum=nums[i]+res[i-1];
           if(i==0) continue;
            res[i]=sum;
        }
        return res;
    }
}