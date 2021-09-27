import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature is " + t);
        System.out.println("Wind speed  is " + v);
        System.out.println("Wind chill  is " + w);
    }
}
