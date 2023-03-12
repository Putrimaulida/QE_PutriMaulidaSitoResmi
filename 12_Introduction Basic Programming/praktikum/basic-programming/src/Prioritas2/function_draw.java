package Prioritas2;
import java.util.Scanner;
public class function_draw {

    public static void drawXYZ(int n) {
        for (int j = 1; j <= (n * n); j++) {
            if (j % 3 == 0) {
                System.out.print(" X ");
            } else if (j % 2 == 1) {
                System.out.print(" Y ");
            } else {
                System.out.print(" Z ");
            }
        }
    }
    public static void main(String[] args) {
        drawXYZ(5);
    }
}
