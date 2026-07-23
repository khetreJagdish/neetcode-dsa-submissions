class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i<n; i++){

            if(visited[i]){
                continue;
            }
            List<String> groups = new ArrayList<>();
            groups.add(strs[i]);
            visited[i] = true;

            for(int j = i+1; j<n; j++){

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
        char[] ch1 = firstString.toCharArray();
        char[] ch2 = secondString.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
