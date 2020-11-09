package be.intecbrussel;

public class ElectricCar extends Car{
    private int battery;

    public ElectricCar(String color, int battery) {
        super(color);
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount) {
        if (amount < 0) {
            slow(-amount);
        } else {
            super.accelerate (amount + this.battery/100 - getHp()/100);
        }
    }

    @Override
    public void slow(int amount) {
        if (amount < 0) {
            accelerate(-amount);
        } else {
            super.accelerate (amount + this.battery/100 - getHp()/100);
        }
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void charge(int amount) {
        this.battery += amount;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                "} " + super.toString();
    }
}
