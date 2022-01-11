package arrays;

public class JavaTask {
    public static void main(String[] args) {

        String str = "Cydeo";

        String result = replaceCharInString(str,'d','b');

        System.out.println(result);




    }

    public static String replaceCharInString(String str,char strCh, char newChar){

        String result = str.replace(strCh,newChar);


        return result;


    }




}
