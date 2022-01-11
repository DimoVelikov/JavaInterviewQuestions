package OOP;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == 'm' || size == 's' || size == 'l' || size == 'M' || size == 'S' || size == 'L') {
            this.size = size;
        } else {
            System.err.println("Invalid input for size");
            System.exit(0);
        }


    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Number can not be negative");
            System.exit(0);
        }
        if (size == 's' || size == 'S') {
            if (numberOfCheeseTopping > 3) {
                System.err.println("Maximum allowed toppings is 3");
                System.exit(0);
            }
        }
        if (size == 'm' || size == 'M') {
            if (numberOfCheeseTopping > 4) {
                System.err.println("Maximum allowed toppings is 4");
                System.exit(0);

            }
        }

        if (size == 'l' || size == 'L') {
            if (numberOfCheeseTopping > 5) {
                System.err.println("Maximum allowed toppings is 5");
                System.exit(0);

            }
        }


        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.err.println("Number can not be negative");
            System.exit(0);
        }
        if (size == 's' || size == 'S') {
            if (numberOfPepperoniTopping > 4) {
                System.err.println("Maximum allowed toppings is 4");
                System.exit(0);
            }
        }
        if (size == 'm' || size == 'M') {
            if (numberOfPepperoniTopping > 5) {
                System.err.println("Maximum allowed toppings is 5");
                System.exit(0);

            }
        }

        if (size == 'l' || size == 'L') {
            if (numberOfPepperoniTopping > 6) {
                System.err.println("Maximum allowed toppings is 6");
                System.exit(0);

            }
        }


        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calcCost(){
        int totalCost = ((size=='s'||size=='S')? 10 :(size=='m'||size=='M')? 12 : 14) + (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost= $" + calcCost() +
                '}';
    }

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('s',2,2);

        System.out.println(pizza1);


    }
}
