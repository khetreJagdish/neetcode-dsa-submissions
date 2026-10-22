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
        
        int i =0;
        while(i < mountainArr.length()){
            
            if(target == mountainArr.get(i)){
                return i;
            }
            i++;
            if(i == 100) return i;
        }
        return -1;
    }
}