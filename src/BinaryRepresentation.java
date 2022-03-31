import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        toBinary(num);
    }

    public static void toBinary(int num) {
        int binary[] = new int[20];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
              System.out.print(binary[i]);
        }
    }

}
