package Arrays;

public class TwoSum_1 {
    public int[] twoSum(int nums[], int target) {
        int ans[] = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    found = true;
                    break;
                }
            }
            if (found == true) {
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 18;
        TwoSum_1 obj = new TwoSum_1();
        int result[] = obj.twoSum(nums, target);
        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);

    }

}
