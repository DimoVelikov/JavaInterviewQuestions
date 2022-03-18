package interviewQuestions;

public class Q13_String_FindUnique {
    //Q13: String -- Find the unique
    //• Write a return method that can find the unique characters from the String
    //• Ex: unique("AAABBBCCCDEF") ==> "DEF";



    //i will create a static method with return type String and that will take String as an argument
    public static String uniqueCharacter(String str){

        // then i will create a empty String to contain the result
        String result = "";

        // i will turn the given String to a String array
        String[] arr = str.split("");

        // i will use nested for each loop and i will check the frequency of the characters
        for (String ch1 : arr) {

            int frequency = 0;
            for (String ch2 : arr) {

                if(ch1.equals(ch2)){
                    frequency++;
                }

            }

            // i will use if statement before on the end of the outer loop to check if the frequency is 1 and if it true
            // i will concatenate the character to the result
            if(frequency==1){
                result+= ch1;
            }


        }


        // i will return the result
        return result;

    }


    public static void main(String[] args) {

        System.out.println(uniqueCharacter("AAABBBCCCDEF"));


    }

}
