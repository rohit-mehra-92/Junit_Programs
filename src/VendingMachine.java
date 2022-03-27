import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the amount putting in vending machine");
        int amount = n.nextInt();
        countNotes(amount);
    }

    static void countNotes(int amount) {
        int[] note = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCount = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= note[i]) {
                noteCount[i] = amount / note[i];
                amount = amount - noteCount[i] * note[i];
            }
        }
        for (int i = 0; i < 9; i++) {
            if (noteCount[i] != 0) {
                System.out.println("Total number of notes of " + note[i] + ":" + noteCount[i]);
            }
        }
    }
}

