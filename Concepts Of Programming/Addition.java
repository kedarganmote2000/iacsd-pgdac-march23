package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to add: \n");
        int a = in.nextInt();
        int b = in.nextInt();

        int c = a + b;
        System.out.println("The sum of the two numbers is: " + c);
    }
}
