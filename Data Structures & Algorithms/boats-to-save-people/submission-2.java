class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int size = people.length;
        boolean[] visited = new boolean[size];
        int boats = 0;
        for (int i = 0; i < size; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            int nextHeavyPerson = -1;
            for (int j = 0; j < size; j++) {
                if (!visited[j] && people[i] + people[j] <= limit) {
                    if (nextHeavyPerson == -1 || people[j] > people[nextHeavyPerson]) {
                        nextHeavyPerson = j;
                    }
                }
            }
            if (nextHeavyPerson != -1) {
                visited[nextHeavyPerson] = true;
            }
            boats++;
        }
        return boats;
    }
}