package interviewQuestions;

public class Q14_Reverse_String {

    //• Q14: Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA


    // I will create a static method with return type String that will take String as an argument

    public static String reverseString(String str){

        // i will create in the method empty string that will contain the result and will be return it at the end of the method
        String result = "";

        // i will iterate the given String from the last index using for loop and
        // i will concatenate to my result each character from the given string from last to first

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }



        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

}
