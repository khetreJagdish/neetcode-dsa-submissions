class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        boolean[] visited   = new boolean[strs.length];
        int size = strs.length;
        for(int i = 0; i<size; i++){

            if(visited[i]){
                continue;
            }
            List<String> groups =new ArrayList<>();
            groups.add(strs[i]);
            visited[i] = true;

            for(int j = i+1; j<size; j++){
                
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    groups.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(groups);
        }
        return result;
    }

    private boolean isAnagram(String firstString, String secondString){
        if(firstString.length() != secondString.length()){
            return false;
        }
        char[] firstArray = firstString.toCharArray();
        Arrays.sort(firstArray);
        char[] secondArray = secondString.toCharArray();
        Arrays.sort(secondArray);
        return Arrays. equals(firstArray,secondArray);
    }
}
