public class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }


    public YerbaMate() {
        this("Default Mate", 12, 2.5, 75, 0);
    }

    public YerbaMate(YerbaMate other) {
        super(other);
        this.numPasses = other.numPasses;
    }

    public int getNumPasses() {
        return this.numPasses;
    }

    public void passMate() {
        this.numPasses++;
        System.out.println("Mate passed. Current count: " + this.numPasses);
    }

    public void refill(int ouncesToAdd) {
        if (ouncesToAdd < 0) {
            throw new IllegalArgumentException("Ounces to add must be non-negative.");
        }
        int newOunces = getOunces() + ouncesToAdd;
        setOunces(newOunces); // This uses the setter from CaffeinatedBeverage which has error checking
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        YerbaMate other = (YerbaMate) obj;
        return this.numPasses == other.numPasses;
    }

    @Override
    public String toString() {
        return String.format("Yerba Mate: %s, %d ounces, brewed @ %d°C, $%.2f, %d passes so far", 
    getName(), getOunces(), getBrewTemp(), getPrice(), numPasses);
    }

}