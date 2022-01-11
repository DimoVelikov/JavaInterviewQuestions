package schoolPractice;

import java.util.Scanner;

public class GrateLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grate:");
        byte grate = scan.nextByte();
        String result ="";

        if(grate>0 && grate<=18){
            switch (grate){
                case 6:
                case 7:
                case 8:
                    result ="middle school";

                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "high school";
                    break;

                case 13:
                case 14:
                case 15:
                case 16:
                    result ="college";
                    break;

                case 17:
                case 18:
                    result= "grand school";

                    break;
                default:
                    result = "elementary school";
                    break;
            }
        }else {
            result="invalid input";
        }

        System.out.println(result.toUpperCase().charAt(0) + result.substring(1));



    }


}
