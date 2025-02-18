public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    public int getBrewTemp() {
        return this.brewTemp;
    }

    public void setBrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;

        Tea that = (Tea) o;
        return super.equals(o) && this.brewTemp == that.getBrewTemp();
    }
    
    @Override
    public String toString() {
        String out = "Tea: " + this.getName() + ", " + this.getOunces() + " oz, brewed at " + this.getBrewTemp() + "C, "
                + "$" + String.format("$%.2f", this.getPrice());

        return out;
    }
}
