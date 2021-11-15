abstract class Building {
    protected int squareFootage;
    protected long price;
    protected int yearBuilt;
    protected String type;


    public Building(int squareFootage, long price, int yearBuilt) {
        this.squareFootage = squareFootage;
        this.price = price;
        this.yearBuilt = yearBuilt;
        type = "None";
    }
    public abstract String printInfo();
}
