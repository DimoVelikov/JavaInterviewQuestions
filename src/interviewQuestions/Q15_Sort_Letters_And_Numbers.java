package interviewQuestions;

import java.util.Arrays;


public class Q15_Sort_Letters_And_Numbers {

    //String -- Sort Letters and Numbers from alphanumeric String:
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort
    //the individual string and append them back together
    //Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"

    // i will crate a static method with return type String and will take String as an argument

    public static String sortString(String str) {


        // i will create and empty String that will contain the result, and it will be returned in the end of the method

        String result = "";


        // i will use a while loop that will be running while the length of the given string is greater than 0
        while (str.length() > 0) {

            // in the loop i will create 2 empty string that i will use to contain letters and digits
            String letters = "";
            String digit = "";

            // in the while loop i will use if statement to check if the first character is letter
            if (Character.isLetter(str.charAt(0))) {

                // in the if statement  i will use a for loop to iterate the given string from the first index to last index
                for (int i = 0; i < str.length(); i++) {

                    // in the for loop i will use a if statment that will concatenate the letters or numbers
                    // and i will use a break statement to exit the loop get to a number
                    if (Character.isLetter(str.charAt(i))) {
                        letters += str.charAt(i);
                    } else {
                        break;
                    }

                }

                // i will remove the letters string from the given String
                str = str.replaceFirst(letters, "");

                // i will use a else if statement with the same logic for digits
            }else if (Character.isDigit(str.charAt(0))) {

                for (int i = 0; i < str.length(); i++) {

                    if (Character.isDigit(str.charAt(i))) {
                        digit += str.charAt(i);
                    } else {
                        break;
                    }

                }
                str = str.replaceFirst(digit, "");
            }



            // i will turn both Strings for letters and digits to String arrays, use a sort method
            // iterate them using for each loop and concatenate them to the result
            String[] lettersArray = letters.split("");
            Arrays.sort(lettersArray);

            for (String each : lettersArray) {
                result += each;
            }

            String[] digitsArray = digit.split("");
            Arrays.sort(digitsArray);

            for (String each : digitsArray) {

                result += each;

            }

        }


        return result;


    }


    public static void main(String[] args) {
        System.out.println(sortString("DC501GCCCA098911"));
    }

}








