public class maxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        System.out.print(maxSum(numbers));
    }

    public static int maxSum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
