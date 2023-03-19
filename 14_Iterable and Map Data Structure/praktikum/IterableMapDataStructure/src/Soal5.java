import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Soal5 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int nextNonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int[] arr2 = {2, 2, 2, 11};

        int len1 = removeDuplicates(arr1);
        System.out.println("Output arr1: " + len1);

        int len2 = removeDuplicates(arr2);
        System.out.println("Output arr2: " + len2);
    }
}
