class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int need = target - nums[i];
            if(hm.containsKey(need)){
                return new int[]{hm.get(need),i};
            }
            
            hm.put(nums[i],i);
        }

        return new int[0];
    }
        //brute force
        /*
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
            //        n.add(i);
           //         n.add(j);
                }
       // return new int[]{n.get(0),n.get(1)};
        }
        return new int[0];
    }
    */
}
