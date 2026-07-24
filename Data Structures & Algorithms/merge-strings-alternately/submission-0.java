class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        while(i < length1 && j < length2){
            
            builder.append(word1.charAt(i))
                    .append(word2.charAt(j));

            i++;
            j++;
        }
        if(i<length1){
            builder.append(word1.substring(i));
        }

        if(j<length2){
            builder.append(word2.substring(j));
        }
    return builder.toString();
    }
}