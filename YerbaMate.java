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
}