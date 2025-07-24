class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i, sum = 0, result = 0, left, right;
        Arrays.sort(nums)
        for (i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result = sum;
                    while (nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (nums[right] == nums[right + 1]) {
                        right++;
                    }
                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right++;
                }
            }
        }
        return result;
    }
}