class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0, length=1;
        nums[low]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[low+1] = nums[i];
                length++;
                low++;
            }
        }
        return length;
    }
}