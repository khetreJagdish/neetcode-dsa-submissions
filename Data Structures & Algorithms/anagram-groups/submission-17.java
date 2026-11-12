class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(int i =0; i<strs.length; i++){

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            hashMap.computeIfAbsent(sorted, key -> new ArrayList()).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }
}
