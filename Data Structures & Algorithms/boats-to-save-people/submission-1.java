class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int size = people.length;
        Arrays.sort(people);
        int left = 0;
        int right = size - 1;
        int boatCount = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            boatCount++;
        }
        return boatCount;
    }
}