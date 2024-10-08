// print a triangle 


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of lines for the triangle
        System.out.print("Enter the number of lines for the triangle: ");
        int lines = scanner.nextInt();

        // Print the triangle
        for (int i = 1; i <= lines; i = i+1) { //or  i++ instead i = i+1
            for (int j = 1; j <= i; j = j+1) { //or j++ instead j = j+1
                System.out.print("_");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Close the scanner
        scanner.close();
    }
}
