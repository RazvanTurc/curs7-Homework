package ro.fasttrackit.homework7;

public class Bottle {
    private int totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, double availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        open = false;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > totalCapacity;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public String openBottle() {
        if(!isOpen()){
            open = true;
            return "Bottle is opened";
        }
        return "The bottle is already opened";
    }

    public String closeBottle() {
        if(isOpen()){
            open = false;
            return "Bottle is closed";
        }
        return "The bottle is closed bro..chill";
    }

    public String drink(double amount) {
        if (!isOpen()) {
            return "Open the bottle first";
        } else if (availableLiquid == 0) {
            return "Your bottle is empty";
        } else if (amount > availableLiquid) {
            return "You only have " + getAvailableLiquid() + "L in the bottle";
        } else {
            availableLiquid -= amount;
            return "You just drank " + amount +
                    "L. You now have " + getAvailableLiquid() + "L left in the bottle";
        }
    }
}
