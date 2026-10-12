class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        
        int length = nums1.length+nums2.length;

        int i =0 , j =0;
        int indexCount = 0;
        int expectedIndex2 =  length / 2;
        int expectedIndex1 =  expectedIndex2-1;
        int firstElement = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE;
        while(i<nums1.length && j<nums2.length){

            if(nums1[i] <= nums2[j]){
                if(indexCount == expectedIndex1)  firstElement = nums1[i];
                if(indexCount == expectedIndex2)  secondElement = nums1[i];
                indexCount++;
                i++;
            }else{
                if(indexCount == expectedIndex1)  firstElement = nums2[j];
                if(indexCount == expectedIndex2)  secondElement = nums2[j];
                indexCount++;
                j++;
            }

            if(firstElement != Integer.MIN_VALUE && secondElement != Integer.MIN_VALUE){
                break;
            }


        }

        while(i < nums1.length){
            if(indexCount == expectedIndex1)  firstElement = nums1[i];
            if(indexCount == expectedIndex2)  secondElement = nums1[i];
            indexCount++;
            i++;

            if(firstElement != Integer.MIN_VALUE && secondElement != Integer.MIN_VALUE){
              break;
            }
        }

        while(j < nums2.length){
            if(indexCount == expectedIndex1)  firstElement = nums2[j];
            if(indexCount == expectedIndex2)  secondElement = nums2[j];
            indexCount++;
            j++;

            if(firstElement != Integer.MIN_VALUE && secondElement != Integer.MIN_VALUE){
              break;
            }
        }

        
        if(length % 2 != 0){
            return (double) secondElement;
        }

        return (double) (firstElement+secondElement) /2;
    }
}
