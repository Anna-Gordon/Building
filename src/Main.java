public class Main {
    public static void main(String[] args) {
        House house = new House(1000, 1000000, 2011, 20000.00);
        Building sauna = new Sauna(100, 450000, 2017, 300.00);
        System.out.println(house.printInfo());
        System.out.println(sauna.printInfo());
        System.out.println(house.rent());
    }
}
