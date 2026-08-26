class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int size = arr.length;
        int minDistance = Integer.MAX_VALUE;
        int startIndex = -1;
        
        for(int i = 0; i<=size-k;i++){

            int currentDistance = 0;
            int j = i;
            while(j<i+k){
                currentDistance += Math.abs(arr[j] - x);
                j++;
            }

            if(currentDistance < minDistance){
                minDistance = currentDistance;
                startIndex = i;
            }

        }
        List<Integer> list = new ArrayList<>();
        for(int i = startIndex; i<startIndex+k; i++){
            list.add(arr[i]);
        }
    return list;
    }
}