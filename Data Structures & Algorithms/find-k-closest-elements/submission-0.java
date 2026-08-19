class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int minDistance = Integer.MAX_VALUE;
        int startIndex = 0;
        for(int i = 0; i<=arr.length-k; i++){

            int distance = 0;

            for(int j = i; j<i+k; j++){

                distance += Math.abs(arr[j] - x);
            }

            if(distance < minDistance){
                minDistance = distance;
                startIndex = i;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = startIndex; i< startIndex + k; i++){
            list.add(arr[i]);
        }
    return list;
    }
}