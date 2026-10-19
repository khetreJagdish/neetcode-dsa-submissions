class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = low + (high-low)/2;

            if (calculatePossibleMinWeight(weights, days, mid)) {
                high = mid -1;
            }else{
                low = mid +1;
            }
        }

        return low;
    }

    private boolean calculatePossibleMinWeight(int[] weights, int days, int currentWeight) {
        int currentDay = 1;
        int weightCapacity = 0;

        for (int weight = 0; weight < weights.length; weight++) {
            if (weightCapacity + weights[weight] > currentWeight) {
                currentDay = currentDay + 1;
                weightCapacity = weights[weight];
            } else {
                weightCapacity += weights[weight];
            }
        }
        if (currentDay <= days)
            return true;
        return false;
    }
}