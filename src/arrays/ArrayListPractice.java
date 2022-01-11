package arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,20));

        boolean search = list.contains(7);

        System.out.println(search);

        System.out.println("----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(4,3,2,7,1,9,4,5,6,7));
        System.out.println(list1);



        System.out.println(list1);

        System.out.println("----------------------");

        System.out.println(list);
        System.out.println(list1);


        //Collections.copy(list1,list); // replace the element of the first list with the second list

        System.out.println(list);
        System.out.println(list1);


        System.out.println("-------------------------");


        Collections.shuffle(list1);

        System.out.println(list1);

        System.out.println("------------------");

        Collections.reverse(list1);

        System.out.println(list1);

        System.out.println("-------------------");


        ArrayList<String> colors = new ArrayList<>();

        colors.addAll(Arrays.asList("red","blue","black","gray","purple","gay"));

        System.out.println(colors);

        List<String> sub = colors.subList(1,4);

        System.out.println(sub);

        System.out.println("-------------------");


        System.out.println(list.equals(list));
        System.out.println(list == list);

        Collections.sort(list);
        Collections.sort(list1);

        System.out.println(list);
        System.out.println(list1);

        List<String> result = new ArrayList<>();

        for (Integer each : list) {

            result.add(list1.contains(each)? "Yes": "No");

        }

        System.out.println(result);


        System.out.println("---------------");

        int temp = list.get(0);
        list.set(0,list.get(1));
        list.set(1,temp);

        System.out.println(list);

        System.out.println("-----------------");


        List<Integer> list2 = new ArrayList<>();

        list2.addAll(list);
        list2.addAll(list1);

        System.out.println(list2);

        System.out.println("-----------------");


        list2.clear();
        System.out.println(list2);

        System.out.println(list2.isEmpty());

        ArrayList<String> trim = new ArrayList<>();

        trim.add("Red");
        trim.add("Red");
        trim.add("Red");
        trim.add("Red");



        System.out.println(trim);

        trim.trimToSize();

        trim.add("Bubbles");

        System.out.println(trim);


        System.out.println("-----------------------");

        System.out.println(trim.size());

        trim.ensureCapacity(6);

        System.out.println(trim);














    }
}
