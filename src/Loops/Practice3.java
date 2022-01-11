package Loops;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive number:");
        int num = scan.nextInt();
        scan.close();

        for(int i = 0; i<=10; i++){
            System.out.println(num +" x " + i + " = " + (num*i) );
        }

    }
}

/*
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
 */