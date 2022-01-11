package StringLoopPractice;

public class Pracrice5 {
    public static void main(String[] args) {
        String str1 = "Dimo";
        String bukva = "";
        String reverse = "";
        System.out.println(str1);

        for(int i = 0; i<str1.length(); i++){
            bukva = str1.substring(i,i+1);
            reverse= bukva + reverse;
        }

        System.out.println(reverse);

    }
}

