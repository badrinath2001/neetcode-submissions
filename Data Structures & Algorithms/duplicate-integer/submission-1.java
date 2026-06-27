class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for(int n : nums){
            if(h.contains(n))
            return true;

            h.add(n);
        }
        return false;

        /*
        boolean p = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                p = true;
                }
            }
        }
        return p;
        */
    }
}