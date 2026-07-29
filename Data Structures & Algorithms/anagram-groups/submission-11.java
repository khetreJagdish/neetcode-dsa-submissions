class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int size = strs.length;
        boolean[] visited = new boolean[size];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i<size; i++){

            if(visited[i]){
                continue;
            }

            List<String> groups = new ArrayList<>();
            groups.add(strs[i]);
            visited[i] = true;

            for(int j = i+1; j<size; j++){

                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    groups.add(strs[j]);
                    visited[j] = true;
                }
            }
        ans.add(groups);
        }
        return ans;
    }

    private boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
