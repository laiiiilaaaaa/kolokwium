public class Sailboat {
    private final int capacity;
    private final double rentFee;
    private boolean isAvailable;

    public Sailboat(String name, int capacity, double rentFee) {
        this.capacity = capacity;
        this.rentFee = rentFee;
        this.isAvailable = true;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getRentFee() {
        return this.rentFee;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}