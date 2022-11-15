import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        //Объекты класса Car

        Car lada = new Car("Lada", "Granta", 1.7f, TypeOfBody.SEDAN);
        System.out.println(lada);
        lada.startMoving();
        lada.finishMoving();
        lada.getPitStop(3.5);
        lada.getBestLapTime(25);
        lada.getMaxSpeed(120);

        Car audi = new Car("Audi", "A850 LTDI quattro", 3.0f, TypeOfBody.SEDAN);
        System.out.println(audi);
        audi.startMoving();
        audi.finishMoving();
        audi.getPitStop(2.2);
        audi.getBestLapTime(20);
        audi.getMaxSpeed(140);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f,TypeOfBody.SEDAN);
        System.out.println(kia);
        kia.getPitStop(3.1);
        kia.getBestLapTime(30);
        kia.getMaxSpeed(110);

        Car bmw = new Car("BMW", "Z8", 3.0f,TypeOfBody.SEDAN);
        System.out.println(bmw);
        bmw.getPitStop(2.5);
        bmw.getBestLapTime(25);
        bmw.getMaxSpeed(110);
        System.out.println();


        // Объекты класса Bus

        Bus paz = new Bus("ПАЗ", "32051", 7.4f, CapacityOfPeople.SMALL);
        System.out.println(paz);
        paz.startMoving();
        paz.finishMoving();
        paz.getPitStop(4);
        paz.getBestLapTime(40);
        paz.getMaxSpeed(120);

        Bus liaz = new Bus("ЛиАЗ", "677", 8.5f, CapacityOfPeople.MEDIUM);
        System.out.println(liaz);
        liaz.getPitStop(4.5);
        liaz.getBestLapTime(42);
        liaz.getMaxSpeed(110);

        Bus welly = new Bus("London Bus Welly", "351", 9.5f, CapacityOfPeople.EXTRA_LARGE);
        System.out.println(welly);
        welly.getPitStop(5);
        welly.getBestLapTime(41);
        welly.getMaxSpeed(100);

        Bus ikarus = new Bus("Икарус", "250.59", 10.4f, CapacityOfPeople.LARGE);
        System.out.println(ikarus);
        ikarus.getPitStop(4.1);
        ikarus.getBestLapTime(45);
        ikarus.getMaxSpeed(100);
        System.out.println();

        // Объекты класс Truck

        Truck maz = new Truck("Маз", "5440", 15.0f, TypeOfCapacity.N1);
        System.out.println(maz);
        maz.startMoving();
        maz.finishMoving();
        maz.getPitStop(5.6);
        maz.getBestLapTime(51);
        maz.getMaxSpeed(120);

        Truck volvo = new Truck("Вольво", "FH460",14.8f, TypeOfCapacity.N3);
        System.out.println(volvo);
        volvo.getPitStop(6.0);
        volvo.getBestLapTime(50);
        volvo.getMaxSpeed(125);

        Truck kamaz = new Truck("Камаз", "43118", 12.0f, TypeOfCapacity.N2);
        System.out.println(kamaz);
        kamaz.getPitStop(4.5);
        kamaz.getBestLapTime(55);
        kamaz.getMaxSpeed(100);

        Truck ural = new Truck("Урал", "4320", 13.5f, TypeOfCapacity.N1);
        System.out.println(ural);
        ural.getPitStop(6.4);
        ural.getBestLapTime(54);
        ural.getMaxSpeed(110);

        DriverB boris = new DriverB("Иванов Борис", "В", 5,lada);
        DriverC ivan = new DriverC("Григорьев Иван", "C", 7,kamaz);
        DriverD kiril = new DriverD("Серов Кирилл","D",10, welly);

        System.out.println();

        boris.fillTheCar();
        ivan.fillTheCar();
        kiril.fillTheCar();
        System.out.println();

        boris.startMoving();
        boris.stopMoving();
        System.out.println();

        ivan.startMoving();
        ivan.stopMoving();
        System.out.println();

        kiril.startMoving();
        kiril.stopMoving();
        System.out.println();

        boris.getMessage();
        kiril.getMessage();
        ivan.getMessage();
        System.out.println();

        lada.printType();
        audi.printType();
        kia.printType();
        bmw.printType();
        System.out.println();

        kamaz.printType();
        maz.printType();
        volvo.printType();
        ural.printType();
        System.out.println();

        ikarus.printType();
        welly.printType();
        paz.printType();
        liaz.printType();
        System.out.println();


        boolean test = Data.validate("example","example", "example");
        if (test) {
            System.out.println("Данные верны!");
        }
        else {
            System.out.println("Данные неверны!");
        }
        service (lada, audi, kia, bmw,
                paz, liaz, welly, ikarus,
                maz, volvo, kamaz, ural);

    }
    private static void service (Transport...transports) {
        for (int i = 0; i < transports.length; i++) {
            serviceTransport(transports[i]);
        }
    }
    private static void serviceTransport (Transport transport) {
        try {
            if (!transport.service()) {
                throw  new RuntimeException("Автомобиль " + transport.getBrand() + " "+ transport.getModel()
                        + " не прошёл диагностику!");
            }
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }
}
