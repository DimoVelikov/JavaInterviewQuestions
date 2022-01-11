package schoolPractice;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check the entered number for equality");
        System.out.println("Enter first number:");
        int n1 = scan.nextInt();
        System.out.println("Enter second number");
        int n2 = scan.nextInt();
        System.out.println("Enter third number");
        int n3 = scan.nextInt();

        String result = (n1 == n2 && n2 == n3)? "all equal" :(n1 == n2 && n1 != n3)?
                "n1 and n2 are equal" :(n2 == n3 && n3 != n1)? "n2 and n3 are equal"
                :(n1 == n3 && n1 != n2)? "n1 and n3 are equal" : "non of the numbers are equal";
        System.out.println(result);

    }
}

/*
6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */