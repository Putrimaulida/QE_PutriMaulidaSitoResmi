import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Soal3 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findPairSum(nums1, target1);
        System.out.println("Input: [1, 2, 3, 4, 6], target= "+target1);
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findPairSum(nums2, target2);
        System.out.println("Input: [2, 5, 9, 11], target= "+target2);
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result2));
    }

    public static int[] findPairSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // jika tidak ditemukan pasangan bilangan yang sesuai
        return new int[] {-1, -1};
    }
}
