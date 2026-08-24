class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> ans = new HashMap<>();
        for(int i =0; i<strs.length; i++){

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            ans.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
        }
    return new ArrayList(ans.values());
    }
}
