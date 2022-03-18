package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseString {

    // write a method to reverse string

    public static String reverse(String str) {
        // create a empty string that will contain the reverse string and will be returned on the end
        String result = "";

        // iterate the string using for loop with initialization last index of the string and condition

        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);
        }

        return result;
    }

    // write a method to check if 2 strings are anagram

    public static boolean isAnagram(String str1, String str2) {


        str1 = str1.toLowerCase();
        String[] arr1 = str1.split("");
        Arrays.sort(arr1);

        str2 = str2.toLowerCase();
        String[] arr2 = str2.split("");
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }

    //sort array without using sort method

    public static int[] sort(int[] arr) {

        int[] result = new int[arr.length];

        //2,3,1,6,7

        ArrayList<Integer> list = new ArrayList<>();


        for (int each : arr) {
            list.add(each);
        }


        for (int i = 0; i < result.length; i++) {

            int temp = list.get(0);
            for (Integer eachInt : list) {
                if (eachInt < temp) {
                    temp = eachInt;
                }
            }
            result[i] = temp;
            list.remove(temp);


        }


        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse("dimo"));
        System.out.println("-----------------------");

        System.out.println(isAnagram("dimo", "Omid"));
        System.out.println("-----------------------");

        int[] arr = {2, 3, 1, 6, 7};
        System.out.println(Arrays.toString(sort(arr)));

    }
}
