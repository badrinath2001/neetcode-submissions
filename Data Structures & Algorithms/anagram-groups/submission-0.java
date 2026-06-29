class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hp = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String key = new String(c);

            if(!hp.containsKey(key)){
                hp.put(key,new ArrayList<>());
            }

            hp.get(key).add(s);
        }
        return new ArrayList<>(hp.values());
    }
}
