class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
        return false;

        int[] n = new int[26];

        for(int i=0;i<s.length();i++){
            n[s.charAt(i) - 'a']++;
            n[t.charAt(i) - 'a']--;

        }
        for(int x : n){
            if(x!=0)
            return false;
        }
        return true;

        /*
        if(s.length()!=t.length())
        return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        }
        */
}
}
