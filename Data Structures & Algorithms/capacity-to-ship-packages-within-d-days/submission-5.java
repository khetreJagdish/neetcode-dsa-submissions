class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minWeight = Arrays.stream(weights).max().getAsInt();
        int maxWeight = Arrays.stream(weights).sum();

        for(int currentWeight = minWeight; currentWeight<=maxWeight; currentWeight++){

            if(calculatePossibleMinWeight(weights,days,currentWeight)){
                return currentWeight;
            }
        }
        return 0;
    }

    private boolean calculatePossibleMinWeight(int[] weights, int days, int currentWeight){
        int currentDay = 1;
        int weightCapacity = 0;

        for(int weight = 0; weight < weights.length; weight++){
            if(weightCapacity+weights[weight] > currentWeight){
                currentDay = currentDay + 1;
                weightCapacity = weights[weight];
            }else{
                weightCapacity += weights[weight];
            }
        }
        if(currentDay <= days) return true;
        return false;
    }
}