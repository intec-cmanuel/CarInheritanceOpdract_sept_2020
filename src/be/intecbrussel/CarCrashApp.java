package be.intecbrussel;

public class CarCrashApp {
    public static void main(String[] args) {
//        Main:
//        Maak nu van elke auto variant ene object aan in je main
//        Methode.
//                Een rode Suv met 250hp
//        Een gele Cabrio met 200hp
//        Een groene Elektrische wagen met 60% opgeladen batterij.
//                Zorg er ook voor dat alle auto's versnellen met 50. Laat zien
//        hoeveel ze na toepassing van de formule echt rijden op dit
//        moment.
//                Parkeer ook alle auto's probeer dit in 1 loop te doen door
//        bijvoorbeeld te werken met aan Auto Array
//        Zorg voor een mooie to string methode van deze auto's.

        Car cabrio = new Cabrio("Yellow", 200);
        Car electCar = new ElectricCar("Green", 60);
        Car suv = new SUV("Red", 250);

        Car[] carArr = new Car[]{cabrio, electCar, suv};

        for (Car car : carArr) {
            car.accelerate(50);
        }

        for (Car car : carArr) {
            System.out.println(car);
        }

        for (Car car : carArr) {
            car.park();
        }

        for (Car car : carArr) {
            System.out.println(car);
        }
    }
}

