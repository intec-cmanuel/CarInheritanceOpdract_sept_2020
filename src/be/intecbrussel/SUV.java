package be.intecbrussel;

public class SUV extends Car {
    private boolean bullbar;
    private boolean isAWDOn;

    public SUV(String color, int hp) {
        super(color, hp);
    }

    public boolean getBullbar() {
        return this.bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean aWD) {
        this.isAWDOn = aWD;
        if (isAWDOn && getSpeed() > 30) {
            // this.speed -= (amount + (hp / 100))
            // 30 = speed - (amount + (hp/100))
            // amount + (hp/100) = speed - 30
            // amount = speed - 30 - (hp/100)
            // amount = sqrt(cos(pi * speed ²) - log(hp)) -> Audric's personal car

            //Without setter
            //slow(getSpeed() - 30 - (getHp() / 100));

            setSpeed(30);

            // Audric's big brain math
            //slow((int) Math.sqrt(Math.cos(Math.PI * Math.pow(getSpeed(), 2) ) - Math.log(getHp())));
        }
    }

    @Override
    public void accelerate(int amount) {
        // Without speed setter
//        if (this.isAWDOn && this.getSpeed() + amount  + getHp() / 100 > 30) {
//            super.accelerate(30 - getSpeed() - getHp() / 100);
//        } else {
//            super.accelerate(amount);
//        }

        super.accelerate(amount);
        if (isAWDOn && getSpeed() > 30) {
            setSpeed(30);
        }
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                "} " + super.toString();
    }
}
