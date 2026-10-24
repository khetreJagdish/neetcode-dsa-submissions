/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         
         int n = mountainArr.length();
         // find PeakIndex so that we can first search in 
         // 0 to PeakIndex Array (increasing Slope)
         // and then if not found the target then we 
         // can search target in Decreasing Slope

         // Step 1 : search for Peak index

         int peakIndex = findPeakIndexInMauntainArray(mountainArr);
        System.out.println("PeakIndex "+ peakIndex);
         // Step 2: search target in increasing Slope i.e. from 0 to PeakIndex
         int index = searchInIncreasingSlope(mountainArr,0,peakIndex,target); 
         System.out.println("index "+ index);
         if(index != -1) return index;

         // Step 3: if not found in Increasing Slope then search target in decreasing Slope i.e. from peakIndex+1 to n-1
         int finalIndex =  searchInDecreasingSlope(mountainArr,peakIndex+1,n-1,target); 
         System.out.println("finalIndex "+ index);
         return finalIndex;

    }

    private int findPeakIndexInMauntainArray(MountainArray mountainArr){
        int left = 0;
        int right = mountainArr.length()-1;

        while(left < right){

            int mid = left + (right-left)/2;

            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                left = mid+1;
            }else{
                right = mid;
            }
        }
    return left;
    }

    private int searchInIncreasingSlope(MountainArray mountainArr , int start , int end, int target){

        int left = start;
        int right = end;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }else if(mountainArr.get(mid) < target){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
    return -1;
    }

    private int searchInDecreasingSlope(MountainArray mountainArr , int start , int end, int target){

        int left = start;
        int right = end;

        while(left <= right){

            int mid = left + (right-left)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            else if(mountainArr.get(mid) < target){
                right = mid-1;
            }else{
                left = mid +1;
                
            }
        }
    return -1;
    }
}