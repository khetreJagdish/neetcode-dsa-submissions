class Solution {
    public int search(int[] nums, int target) {
        // pivot method

        // 1) Find pivot
        int pivot = findPivot(nums);

        if (pivot == 0) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    public int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
