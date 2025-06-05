class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int prodLeft =1,prodRight=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=prodRight;
            prodRight = prodRight*nums[i];
        }
        for(int i=0;i<n;i++){
            answer[i]=answer[i]*prodLeft;
            prodLeft = prodLeft*nums[i];
        }
        return answer;
    }
}
