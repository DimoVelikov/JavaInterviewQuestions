package StringLoopPractice;

public class Practice4 {
    public static void main(String[] args)
    {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        System.out.println(message);

        // Write a loop here that replaces every occurrence of "cat"
        // in the message with "dog", using indexOf and substring.

        int index = 0;

        while (message.indexOf("cat")>0){
            index = message.indexOf("cat");
            String firstpart = message.substring(0,index);
            String lastpart = message.substring(index+3);
            message = firstpart + "dog" + lastpart;
        }

        System.out.println(message);




    }
}
