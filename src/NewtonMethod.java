import java.util.Scanner;

public class NewtonMethod {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        double c = in.nextDouble();

        double val = sqrt(c);
        System.out.println("Square root of number : " + val);

    }

    static double sqrt(double c) {

        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }

        return t;
    }
}
