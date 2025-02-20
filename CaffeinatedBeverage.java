public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    // Default Constructor
    public CaffeinatedBeverage() {
        this.name = "";
        this.ounces = 0;
        this.price = 0.0;
    }

    public CaffeinatedBeverage(String name, int ounces, double price) {
        setName(name);
        setOunces(ounces);
        setPrice(price);
    }

    // Copy Constructor
    public CaffeinatedBeverage(CaffeinatedBeverage other) {
        this.name = other.name;
        this.ounces = other.ounces;
        this.price = other.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;  
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }
    
    public boolean sip(int amount) {
        int remainder = Math.max(this.ounces - amount, 0);
        return remainder > 0;
    }
}