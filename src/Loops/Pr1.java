import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        scan.close();

        int giftCard = 100;
        int balance;
        int price;

        switch(item){

            case "Blanket":
                price = 60;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;
            case "Charger":
                price = 15;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;
            case "Hat":
                price = 25;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "Headphones":
                price= 30;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "Laptop" :
                price = 200;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "Pants" :
                price = 50;
                balance = giftCard - price;
                if(price<giftCard)
                    if(price<giftCard) {
                        System.out.println("Thank you for your purchase!" + "\n" +
                                "Your current balance is: " + balance);
                    }else{
                        System.out.println("Sorry, not enough funds on your gift card!");
                    }
                break;

            case "Pillow":
                price = 40;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "Smartphone":
                price= 1000;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "Socks":
                price = 5;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;

            case "USB cable":
                price = 10;
                balance = giftCard - price;
                if(price<giftCard) {
                    System.out.println("Thank you for your purchase!" + "\n" +
                            "Your current balance is: " + balance);
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                break;
            default:
                System.out.println("Invalid item");
                break;
        }






    }
}