class Solution {
    public int[] sortArray(int[] nums) {
        int length = nums.length;
        mergeArray(nums, length);
        return nums;
    }

    public void mergeArray(int[] nums, int numberOfElements) {
        if (numberOfElements <= 1) {
            return;
        }
        int mid = numberOfElements / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[numberOfElements - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = nums[i];
        }

        for (int i = mid; i < numberOfElements; i++) {
            rightArray[i - mid] = nums[i];
        }

        mergeArray(leftArray, mid);

        mergeArray(rightArray, numberOfElements - mid);

        merge(nums, leftArray, rightArray, mid, numberOfElements - mid);
    }

    public void merge(int[] nums, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        while (i < left) {
            nums[k++] = leftArray[i++];
        }

        while (j < right) {
            nums[k++] = rightArray[j++];
        }
    }
}