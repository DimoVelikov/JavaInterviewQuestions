package schoolPractice;

import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        String result = (number ==1)? "One" :(number == 2)? "Two" :(number == 3)? "Three" :(number == 4)? "Four"
        :(number == 5)? "Five" :(number == 6)? "Six" :(number == 7)? "Seven" :(number ==9)? "Nine"
                :(number == 0)? "Zero" : "number you enter is not between 0-9";

        System.out.println(result);

    }
}

/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */