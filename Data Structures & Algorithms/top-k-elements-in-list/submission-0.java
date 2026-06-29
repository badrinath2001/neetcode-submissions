class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        //counting the frequencies
        for(int key : nums){
            hashmap.put(key, hashmap.getOrDefault(key,0)+1);
        }
        //Hashmap to ArrayList
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashmap.entrySet());
        //sort
        Collections.sort(list, (a,b) -> Integer.compare(b.getValue(), a.getValue()));
        //build Array
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = list.get(i).getKey();
        }
        //return
        return arr;
    }
}


