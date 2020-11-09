package be.intecbrussel;

public class Cabrio extends Car{
    private boolean sunroof;

    public Cabrio(String color, int hp) {
        super(color, hp);
    }

    public boolean getSunroof() {
        return this.sunroof;
    }

    public void openRoof() {
        this.sunroof = !this.sunroof;
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof=" + sunroof +
                "} " + super.toString();
    }
}
