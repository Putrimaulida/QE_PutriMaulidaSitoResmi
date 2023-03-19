import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("kazuya", "jin", "lee"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("kazuya", "feng"));

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("lee", "jin"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("kazuya", "panda"));

        //Menambahkan item dari List ke Set
        Set<String> set = new LinkedHashSet<>(list1);
        set.addAll(list2);

        Set<String> set1 = new LinkedHashSet<>(list3);
        set1.addAll(list4);

        //Mengubah Set ke ArrayList
        ArrayList<String> combinedList = new ArrayList<>(set);
        ArrayList<String> combinedList1 = new ArrayList<>(set1);

        System.out.println("Input: "+list1+list2);
        System.out.println("Output: "+combinedList);
        System.out.println("Input: "+list3+list4);
        System.out.println("Output: "+combinedList1);
    }
}
