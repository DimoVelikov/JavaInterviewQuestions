package StringLoopPractice;

import java.util.Scanner;

public class Practice6 {

    static int guess;
    public static void main(String[] args) {


        String temp = Integer.toString(guess);
        String temp2;
        int temp3;
        int[] newGuess = new  int[temp.length()];

        for(int i = 0; i<temp.length(); i++){
            if(i!=temp.length()){
                temp2 =temp.substring(i,i+1);

            }else{
                temp2= temp.substring(i);
            }
            temp3 = Integer.parseInt(temp2);
            newGuess[i] = temp3;
        }

        for(int i=0; i<newGuess.length; i++ ){
            System.out.println(newGuess[i]);
        }





    }
}
