public class EnergyDrink extends CaffeinatedBeverage {
    private int caffeineMg;

    public EnergyDrink(String name, int ounces, double price, int caffeineMg) {
        super(name, ounces, price);
        if (caffeineMg < 0) {
            throw new IllegalArgumentException("Caffiene content must be more than Zero");
        }
        this.caffeineMg = caffeineMg;
    }
    //default constructor
    public EnergyDrink() {
        this("Deault Energy Drink", 16, 2.99, 300);
    }
    //Copy Constructor
    public EnergyDrink(EnergyDrink other) {
        super(other);
        this.caffeineMg = other.caffeineMg;
    }
    //Getter
    public int getcaffeineMg() {
        return caffeineMg;
    }
    //Setter
    public void setCaffeineMg(int caffeineMg) {
        if (caffeineMg < 0) {
            throw new IllegalArgumentException("Caffeine content cannot be negative");
        }
        this.caffeineMg = caffeineMg;
    }

    public double calculateCaffeineConcentration() {
        return (double) caffeineMg / getOunces();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        EnergyDrink other = (EnergyDrink) obj;
        return this.caffeineMg == other.caffeineMg;
    }
    
    @Override
    public String toString() {
        return String.format("Energy Drink: %s, %d ounces, $%.2f, %dmg caffeine",
                getName(), getOunces(), getPrice(), caffeineMg);
    }
}