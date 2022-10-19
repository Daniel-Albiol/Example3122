import java.util.Scanner;

public class Example3122 {
    public static void main(String[] argv) {
        int n;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("/ ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("/ ");
            }
            System.out.println(); // Change of line
        }
    }

}
