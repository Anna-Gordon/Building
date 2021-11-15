public class Sauna extends Building implements Rentable {
    double ratePerHour;

    public Sauna(int squareFootage, long price, int yearBuilt, double ratePerHour) {
        super(squareFootage, price, yearBuilt);
        this.ratePerHour = ratePerHour;
        type = "Sauna";
    }

    @Override
    public String printInfo() {
        return "Building info: " + type + " built in " + yearBuilt + ", price " + price + ", square footage " + squareFootage;
    }

    @Override
    public String rent() {
        return ratePerHour + "/hour";
    }
}
