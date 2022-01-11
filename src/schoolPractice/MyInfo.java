package schoolPractice;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your gender:");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name:");
        String name = scan.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your zip code:");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your School name:");
        String schoolName = scan.nextLine();
        System.out.println("Enter your city name:");
        String city = scan.nextLine();
        System.out.println("Enter your state name:");
        String state = scan.next();
        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street name:");
        String streetName = scan.nextLine();

        System.out.println(name + "\n" + age + "\n" + gender + "\n" + phoneNumber +
                "\n" + "\t" + "\t" + buildingNumber +" "+ streetName + "\n"+ "\t"+ "\t" + city +", " + state + " " + zip +
                "\n" + schoolName);






    }
}

/*

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */