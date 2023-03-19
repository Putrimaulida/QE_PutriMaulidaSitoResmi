import java.util.*;

public class Soal4 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 3, 5, 10, 16));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(3, 8));
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(2, 8));

        // display original ArrayList
        System.out.println("Input: " + arr1 +" dan "+ arr2);
        ArrayList<Integer> result1 = getUnique(arr1, arr2);
        System.out.print("Output: ");
        printArray(result1);

        System.out.println("Input: " + arr3 +" dan "+ arr4);
        ArrayList<Integer> result2 = getUnique(arr3, arr4);
        System.out.print("Output: ");
        printArray(result2);



    }
    public static ArrayList<Integer> getUnique(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
