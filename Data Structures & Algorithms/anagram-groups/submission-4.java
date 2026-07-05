class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int length = strs.length;
        // which will store Uniue string as key and List of String as value
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<length; i++){

            String value = strs[i];
            char[] charArray = value.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            map.computeIfAbsent(key , key1 -> new ArrayList<>()).add(value);
            
        }
    return new ArrayList<>(map.values());
    }
}
