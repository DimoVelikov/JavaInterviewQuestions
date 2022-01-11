package OOP;

public class Carpet {

    private double  width, length, unitPrice;

    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost(){
        double cost = (width*length)*unitPrice + ((isPersian)? 200 :0);
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost= $" + calcCost() +
                '}';
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(5,5,10,true);
        System.out.println(carpet1);
    }

}
