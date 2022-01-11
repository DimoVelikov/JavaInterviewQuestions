package While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        System.out.println("Enter second number:");
        int n2 = scan.nextInt();
        System.out.println("Enter math operator:");
        char ch = scan.next().charAt(0);


        while (!(ch == '+' || ch =='-')){
            System.err.println("Invalid, please re enter");
            ch = scan.next().charAt(0);

        }

        System.out.println((ch == '+')? n1+n2 :n1-n2);








    }

}
