package schoolPractice;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        String result = (age>0 && age<=2)? "infant" :(age>=3 && age<=5)? "toddler"
                :(age>=6 && age<=9)? "kid":(age>=10 && age<=12)? "pre-teen" :(age>=13 && age<=17)?
                "teenager":(age>=18 && age<=20)? "young adult" :(age>=21 && age<=39)? "adult"
                :(age>=40 && age<=49)? "young mid-age adult" :(age>=50 && age<=54)? "mid-age adult"
                :(age>=55 && age<=64)? "very young senior" :(age>=75 && age<=84)? "senior"
                :(age>=85 && age<=120)? "old senior" : "invalid input";

        System.out.println("Your age group is: " + result);


    }
}
/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */