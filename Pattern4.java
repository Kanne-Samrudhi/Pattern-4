package comm;
import java.util.Scanner;
public class Pattern4 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number of rows
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("   "); // 3 spaces for indentation
            }

            // Print alternating 0s and 1s
            for (int j = 0; j < n - i; j++) {
                System.out.print((i + j) % 2 + " ");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
