class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;
        HashMap<String,List<String>> groupMap = new HashMap<>();

        for(int i = 0; i<n; i++){
            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);
            String sortedString = new String(ch1);
            groupMap.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(strs[i]);
        }
    return new ArrayList<>(groupMap.values());
    }
}
