package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int  fact=1;
        int num = in.nextInt();

        while(num!=0){
            fact*=num;
            num--;
        }

        System.out.println("The Factorial of your number is: " + fact);
    }
}
