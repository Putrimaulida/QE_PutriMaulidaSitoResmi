import java.util.ArrayList;
import java.util.List;
public class Soal2 {
    public static void main(String[] args) {
        String input = "76523752";
        List<Character> output = new ArrayList<>();

        String input1 = "1122";
        List<Character> output1 = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (input.indexOf(a) == input.lastIndexOf(a)) {
                output.add(a);
            }
        }
        System.out.println("Input: "+input);
        System.out.println("Output: "+output);
        System.out.println("Input: "+input1);
        System.out.println("Output: "+output1);
    }
}