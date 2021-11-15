public class House extends Building implements Rentable {
    double ratePerMonth;
    private boolean yard = true;

    public House(int squareFootage, long price, int yearBuilt, double ratePerMonth) {
        super(squareFootage, price, yearBuilt);
        this.ratePerMonth = ratePerMonth;
        type = "House";
    }

    @Override
    public String printInfo() {
        return "Building info: " + type + " built in " + yearBuilt + ", price " + price + ", square footage " + squareFootage + ", has yard " + yard;
    }

    @Override
    public String rent() {
        return ratePerMonth + "/month";
    }
}
