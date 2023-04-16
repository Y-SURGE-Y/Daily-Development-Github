public class Kadane {
    public static int maxSum2(int[] numbers) {
        int cs = 0;
        int ms = 0;
        int sp = Integer.MIN_VALUE;
        int count = 0;
        // check for the -ve
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count++;
            }
        }
        // if all negative
        if (count == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                sp = Math.max(sp, nums[i]);
            }
            return sp;
        }

        // Kadane
        else {
            for (int i = 0; i < nums.length; i++) {
                cs = cs + nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                if (cs > ms) {
                    ms = cs;
                }
            }
        }
        return ms;
    }
}
