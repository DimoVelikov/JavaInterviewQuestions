package interviewQuestions;

public class MaxOfArray {

    public static int minOfArray(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if(each<min){
                min= each;
            }
        }

        return min;

    }

    public static void main(String[] args) {

         /*
        Write a function that can find the maximum number from an int Array
     */

        int[] arr = {1,2,5,7,12,532};

        int max = Integer.MIN_VALUE;

        for (int each : arr) {

            if(each>max){
                max = each;
            }

        }

        System.out.println(max);

        System.out.println("----------------------------------------------");


        System.out.println(minOfArray(arr));

    }

}
