import java.util.Scanner;

public class SwapNibbles {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.print(swapNibbles(x));
    }

    static int swapNibbles(int x) {
        return ((x & 0xF0) << 4 | (x & 0xF0) >> 4);
    }
}
