package week2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main( String[] args ) {
        // Create a Scanner object for console input
        Scanner input = new Scanner(System.in);
        // Declare variables
        int n;
        System.out.println( "This is a template  program for console I/O." );
        System.out.print( "Enter an integer: " );
        n = input.nextInt();  // input an integer from keyboard
        n = n + 1;
        System.out.println( "n=" + n );
    }

}
