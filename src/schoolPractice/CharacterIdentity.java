package schoolPractice;

import java.util.Scanner;

public class CharacterIdentity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.println("ch = " + ch);



        String result = (ch>65 && ch<91 || ch>96 && ch<123)? "Alphabetic Character" : (ch> 48 & ch< 58)?"Number" : "Special Character";

        System.out.println(result);




    }
}

/*
Create a class called Character Identity, and write a program that
can identify if the given character is a digit or Alphabetic
Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */