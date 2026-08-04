class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i =0; i<strs.length; i++){

            if(visited[i]) continue;

            List<String> groups = new ArrayList<>();
            groups.add(strs[i]);
            visited[i] = true;

            for(int j = 0; j<strs.length; j++){

                if(!visited[j] && isAnagram(strs[i],strs[j])){
                    groups.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(groups);
        }
        return ans;
    }

    private boolean isAnagram(String str1 , String str2){

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
