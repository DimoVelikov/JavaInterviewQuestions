package Loops;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt();
        scan.close();

        int sumEven = 0;
        int sumOdd = 0;

        if(num%2 == 0){
            sumEven = sumEven + num;
        }else {
            sumOdd = sumOdd + num;
        }

        System.out.println(sumEven);
        System.out.println(sumOdd);



    }
}
/*
Write a program that reads a set of integers, and then prints the
sum of the even and odd integers.
 */