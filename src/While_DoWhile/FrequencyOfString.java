package While_DoWhile;

public class FrequencyOfString {
    public static void main(String[] args) {
        String sentence = "JavaJavaJava";
        String word = "Java";
        int count =0;

        for (int i = 0; i <sentence.length()-3 ; i++) {

            if(sentence.substring(i,i+4).equals("Java")) {
                count += 1;

            }

        }

        System.out.println(count);



    }
}
