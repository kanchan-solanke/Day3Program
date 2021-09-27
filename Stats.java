import java.util.Arrays;
import java.util.Random;

public class Stats {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        // Average Value
        double avg = (a + b + c + d + e) / 5;
        System.out.println("Values are" + a + " " + b + " " + c + " " + d + " " + e);

        System.out.println(avg);

        // Max and Min
        double arr[] = new double[5];

        double max = 0;
        double min = arr[0];
        double i;

        for (i = 0; i < 5; i++) {
            double RandNum = Math.random();
            arr[(int) i] = RandNum;

            if (i == 0) System.out.print("[");

            System.out.print(arr[(int) i] + " ");

            if (i == 4) System.out.println("]");


            if (RandNum > max) {
                max = RandNum;
            }

            if (i > 0) {
                if (RandNum < arr[0]) {
                    min = RandNum;
                }
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
