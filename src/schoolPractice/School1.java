package schoolPractice;

import java.util.Scanner;

public class School1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scan.next();
        scan.close();


        if(input.charAt(0)=='x'){
            input = input.replaceFirst("x","a") + input.substring(1) ;

        }

        System.out.println(input);


    }
}

/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */