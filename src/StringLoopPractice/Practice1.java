package StringLoopPractice;

public class Practice1 {
    public static void main(String[] args) {
        String s = "are apples tasty without on a?";
        int index = 0;
        System.out.println(s);

        while (s.indexOf("a")>0){
            index = s.indexOf("a");
            s= s.substring(0,index) + s.substring(index +1);
        }

        System.out.println(s);
    }
}
