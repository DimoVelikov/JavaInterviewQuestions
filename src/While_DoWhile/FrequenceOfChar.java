package While_DoWhile;

public class FrequenceOfChar {
    public static void main(String[] args) {
        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) == ch) {
                frequency += 1;
            }



        }

        System.out.println(frequency);



    }
}
