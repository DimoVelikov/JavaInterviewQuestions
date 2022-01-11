package Loops;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int reverse = 0;

        while (num !=0){
            int digits = num %10;
            reverse = reverse * 10 + digits;

            num = num /10;

        }

        System.out.println(reverse);


    }
}
/*
Write a program that prompts the user to input an integer and then outputs the number
 with the digits reversed.For example, if the input is 12345, the output should be 54321.
 */