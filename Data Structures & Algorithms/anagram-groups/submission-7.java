class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();

        for(String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(hashMap.containsKey(sortedString)){
                hashMap.get(sortedString).add(word);
            }else{
                List<String> group = new ArrayList<String>();
                group.add(word);
                hashMap.put(sortedString,group);
            }
        }
     return new ArrayList<>(hashMap.values());
    }
}
