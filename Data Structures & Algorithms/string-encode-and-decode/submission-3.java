class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s : strs){
            builder.append(s.length())
            .append("#")
            .append(s);
        }
        return builder.toString();

    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+length);
            list.add(word);
            i = j+1+length;
        }
        return list;

    }
}
