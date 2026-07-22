class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hashMap = new HashMap<>();

        for(String word : strs){

        String frequenceString = frequencyString(word);
        hashMap.computeIfAbsent(frequenceString, k -> new ArrayList()).add(word);
        
        }
        return new ArrayList<>(hashMap.values());
    }

    private String frequencyString(String word){

        int[] count = new int[26];

        for(char c  : word.toCharArray()){
            count[c - 'a']++;
        }

        StringBuilder frequenceString = new StringBuilder();
        char c = 'a';
        for(int i : count){
            frequenceString.append(c).append(i);
            c++;
        }
    return frequenceString.toString();
    }
}
