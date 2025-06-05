class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> compliment = new HashMap<>();
        for(int i=0;i<n;i++){
            Integer index = compliment.get(nums[i]);
            if(index!=null) return new int[]{index,i};
            compliment.put(target - nums[i],i);
        }
        return new int[]{};
    }
}
