package leetcode2023.date_11_24;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int res=1;
        for(int i=1;i<nums.length;i++){
            dp[i]=1;
            for (int j=0;j<=i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
