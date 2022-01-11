package Loops;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int sum = 0;
        char choice;

        do {
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter second number:");
            int num2 = scan.nextInt();

            sum = num1 + num2;

            System.out.println("sum = " + sum);
            System.out.println("Do you want to continue?");
            choice = scan.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');


    }
}
/*
Write a do-while loop that asks the user to enter two numbers.
The numbers should be added and the sum displayed.
The loop should ask the user whether he or she wishes to perform the operation again.
If so, the loop should repeat; otherwise it should terminate.


 */