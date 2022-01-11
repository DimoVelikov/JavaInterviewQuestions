package schoolPractice;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade:");
        char grade = scan.next().toUpperCase().charAt(0);

        String resut = (grade== 'A' || grade == 'B' || grade== 'C' || grade =='D' || grade == 'F')?(
                (grade== 'A')? "excellent" :(grade == 'B' )? "great job" :(grade=='C')? "good" :(grade=='D')?
                        "passed" : "failed"
                ): "invalid input";

        System.out.println(resut);
    }
}

/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */