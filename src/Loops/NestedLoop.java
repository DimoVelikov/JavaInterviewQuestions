package Loops;

public class NestedLoop {
    public static void main(String[] args) {
        /*

        for(int i =0; i<10; i++){
            for(int j= 0; j<5; j++){
                System.out.println(i +" " +j);
            }
        }

         */

        double[] dblist = {5.1,1.2,3.0,5.0};

        double max = dblist[0];

        for(int i = 0; i<dblist.length; i++){
            if(dblist[i]>max){
                max= dblist[i];
            }
        }

        System.out.println(max);




    }
}
