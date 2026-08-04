class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hashMap = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++){

            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);
            String str = new String(ch1);
            hashMap.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);

        }
        return new ArrayList<>(hashMap.values());
    }
}
