package OOP;

public class Item {

    private String name;

    private double unitPrice;

    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            System.err.println("Name can not be empty");
            System.exit(0);
        }
        if (name.startsWith(" ")) {
            System.err.println("Name can not start with space");
            System.exit(0);
        }

        if (Character.isDigit(name.charAt(0))) {
            System.err.println("Name must start with letter");
            System.exit(0);

        }

        for (int i = 0; i < name.length(); i++) {

            if (!Character.isLetterOrDigit(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))) {
                System.err.println("Name can not contain special characters");
                System.exit(0);
            }


        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Unit Price can not be negative");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity can not be negative");
            System.exit(0);
        }
        if (name.equals("toilet paper") && quantity > 1) {
            System.err.println("Maximum quantity allowed is 1");
            System.exit(0);
        }

        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }

    public double calcCost() {
        double totalCost = quantity * unitPrice;
        return totalCost;

    }
}

