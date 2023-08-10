package Step3Arrays.Easy;

public class S11MaxConsecutiveOne {
    public static void main(String[] args) {

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxOne = Math.max(maxOne, count);
        }

        return maxOne;
    }
}
