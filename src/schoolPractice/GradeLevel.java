package schoolPractice;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade level:");
        byte gradeLevel = scan.nextByte();


        String result = (gradeLevel > 0 && gradeLevel <= 18) ? ((gradeLevel <= 5) ? "Elementary school" : (gradeLevel <= 8) ?
                "Middle school" : (gradeLevel <= 12) ? "High school" : (gradeLevel <= 16) ?
                "College" :  "Grand school") : "Invalid grade level given";

        System.out.println(result);

    }


}



/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */