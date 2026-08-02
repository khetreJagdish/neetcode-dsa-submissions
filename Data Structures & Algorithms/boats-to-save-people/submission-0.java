class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int boats = 0;
        int size = people.length;
        boolean[] visited   = new boolean[size]; 
        for(int i = 0; i<size; i++){

            if(visited[i]) continue;

            visited[i] = true;

            int partner = -1;
            for(int j = 0; j<size; j++){

                if(!visited[j] && people[i] + people[j] <= limit){

                    if(partner == -1 || people[j] > people[partner]){
                        partner = j;
                    }
                }
            }

            if(partner != -1){
                visited[partner] = true;
            }
            boats++;

        }
    return boats;
    }
}