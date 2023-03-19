import java.util.ArrayList;
import java.util.Arrays;

public class coba {
    public static int findMaxSubArray(ArrayList<Integer> arr, int k) {
        int maxSum = 0, windowSum = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.size(); windowEnd++) {
            windowSum += arr.get(windowEnd);  // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr.get(windowStart);  // subtract the element going out
                windowStart++;  // slide the window ahead
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        int k1 = 3;
        System.out.println("Input: "+arr1+ ", k= "+k1);
        System.out.print("Output: ");
        System.out.println(findMaxSubArray(arr1, k1));

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 3, 4, 1, 5));
        int k2 = 2;
        System.out.println("Input: "+arr2+", k= "+k2);
        System.out.print("Output: ");
        System.out.println(findMaxSubArray(arr2, k2));
    }
}
