package interviewQuestions;

public class UniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {
        String str = "aaasfffgghhttte";

        String[] arr = str.split("");

        for (String ch1 : arr) {
            int frequency = 0;

            for (String ch2 : arr) {
                if(ch1.equals(ch2)){
                    frequency++;
                }

            }
            if(frequency==1){
                System.out.println(ch1);
                break;

            }




        }

    }
}
