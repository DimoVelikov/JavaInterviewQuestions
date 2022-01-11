package schoolPractice;

import java.io.*;
import java.util.*;

public class String1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String st1 = A.substring(0,1).toUpperCase() + A.substring(1);
        A= st1;
        String st2 = B.substring(0,1).toUpperCase() + B.substring(1);
        B = st2;
        int s1 = A.length();
        int s2 = B.length();

        /*if(A.charAt(0)>B.charAt(0)){
            System.out.println(s1 + s2 + "\n Yes \n" +A + B);
        }else{
            System.out.println(s1 + s2 + "\n No \n" +A +" " + B);
        }
         */
        System.out.println(s1+s2 + "\n" +(A.compareTo(B)>0?"Yes":"No") + "\n" +A+B );











    }
}

