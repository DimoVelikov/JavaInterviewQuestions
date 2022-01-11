package schoolPractice;

public class School3 {
    public static void main(String[] args) {

        String firstName = "cyDEo";
        String  lastName = "SCHOOL";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + "\n" + lastName);


    }
}

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */