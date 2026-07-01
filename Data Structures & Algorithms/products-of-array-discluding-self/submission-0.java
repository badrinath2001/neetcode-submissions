class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int[] left = left(nums);
        int[] right = right(nums);

        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    static int[] left(int[] nums) {

        int[] left = new int[nums.length];

        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            left[i] = product;
            product *= nums[i];
        }

        return left;
    }

    static int[] right(int[] nums) {

        int[] right = new int[nums.length];

        int product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = product;
            product *= nums[i];
        }

        return right;
    }
}