import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter the temperature in 'c' for Celsius and 'f' for Fahrenheit");

        int temperature = p.nextInt();

        int t = p.next().charAt(0);

        temperatureConversion(t, temperature);

    }

    static int temperatureConversion(int t, int temperature) {
        int convert = 0;
        if (t == 'c' || t == 'C') {
            convert = (temperature * 9 / 5) + 32;
            System.out.println("temperature in Fahrenheit : " + convert + " degree");
        } else if (t == 'f' || t == 'F') {
            convert = (temperature - 32) * 5 / 9;
            System.out.println("temperature in Celsius: " + convert + " degree");
        } else {
            System.out.println("Enter correct input");
            return 0;

        }
        return convert;
    }
}