import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Harbor h1 = new Harbor("Sailor's Cove", "22 Marina Drive", "Gdansk", "Poland");
        Sailboat s1 = new Sailboat("Sea breeze", 4, 150.00);
        Sailboat s2 = new Sailboat("Wind Whisperer", 6, 200.00);
        Sailboat s3 = new Sailboat("Oceanic", 8, 250.00);
        Sailboat s4 = new Sailboat("Nautical Dream", 10, 300.00);
        h1.addShip(s1);
        h1.addShip(s2);
        h1.addShip(s3);
        h1.addShip(s4);
        @Deprecated Sailboat boat1 = h1.rentSailboat(new Date(2020, 1, 1), "John Smith", 5);
        @Deprecated Sailboat boat2 = h1.rentSailboat(new Date(2020, 1, 1), "Andrew Maleness", 3);
        @Deprecated Sailboat boat3 = h1.rentSailboat(new Date(2020, 1, 1), "John Doe", 4);
        @Deprecated Sailboat boat4 = h1.rentSailboat(new Date(2020, 1, 1), "Anne Smith", 3);
        double income = h1.calculateIncome();
        System.out.println("Total rental income is: " + income);
    }
}