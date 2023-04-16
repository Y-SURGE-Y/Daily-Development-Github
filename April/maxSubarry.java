public class maxSubarry {
    public static void main(String[] args) {
        int[] number1 = { 1, -2, 6, -1, 3 };
        System.out.println(maxSum2(number1));

    }

    class Solution {
        public int maxSubArray(int[] nums) {
            int currSum = 0;
            int maxSeenSoFar = Integer.MIN_VALUE;
            // Initialize to lowest possible value
            int[] prefix = new int[nums.length];
            prefix[0] = nums[0];

            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                int start = i;
                for (int j = i; j < nums.length; j++) {
                    int end = j;
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    maxSeenSoFar = Math.max(maxSeenSoFar, currSum);
                }
            }
            return maxSeenSoFar;
        }
    }
}
