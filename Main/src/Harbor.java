import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Harbor {
    private final ArrayList<Sailboat> boats = new ArrayList<>();

    public Harbor(String name, String address, String city, String country) {

    }

    public void addShip(Sailboat s) {
        boats.add(s);
    }

    public Sailboat rentSailboat(Date date, String person, int amount) {
        try {
            Sailboat boat = null;
            int index = 0;
            for (int i = 0; i < this.boats.size(); i++) {
                if (this.boats.get(i).getCapacity() >= amount) {
                    if (this.boats.get(i).getIsAvailable()) {
                        boat = this.boats.get(i);
                        index = i;
                        break;
                    }
                }
            }
            if (LocalDate.now().isAfter(date.toLocalDate()) || boat == null) {
                throw new IllegalArgumentException();
            }
            this.boats.get(index).setIsAvailable(false);
            return boat;
        } catch (IllegalArgumentException e) {
            System.out.println("No such boat available");
            throw new IllegalArgumentException();
        }
    }

    public double calculateIncome() {
        double income = 0;
        for (Sailboat s : boats) {
            income += s.getRentFee();
        }
        return income;
    }
}