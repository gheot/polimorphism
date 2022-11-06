import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Объекты класса Car

        Car lada = new Car("Lada", "Granta", 1.7f);
        System.out.println(lada);
        lada.startMoving();
        lada.finishMoving();
        lada.getPitStop(3.5);
        lada.getBestLapTime(25);
        lada.getMaxSpeed(120);

        Car audi = new Car("Audi", "A850 LTDI quattro", 3.0f);
        System.out.println(audi);
        audi.startMoving();
        audi.finishMoving();
        audi.getPitStop(2.2);
        audi.getBestLapTime(20);
        audi.getMaxSpeed(140);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f);
        System.out.println(kia);
        kia.getPitStop(3.1);
        kia.getBestLapTime(30);
        kia.getMaxSpeed(110);

        Car bmw = new Car("BMW", "Z8", 3.0f);
        System.out.println(bmw);
        bmw.getPitStop(2.5);
        bmw.getBestLapTime(25);
        bmw.getMaxSpeed(110);
        System.out.println();


        // Объекты класса Bus

        Bus paz = new Bus("ПАЗ", "32051", 7.4f);
        System.out.println(paz);
        paz.startMoving();
        paz.finishMoving();
        paz.getPitStop(4);
        paz.getBestLapTime(40);
        paz.getMaxSpeed(120);

        Bus liaz = new Bus("ЛиАЗ", "677", 8.5f);
        System.out.println(liaz);
        liaz.getPitStop(4.5);
        liaz.getBestLapTime(42);
        liaz.getMaxSpeed(110);

        Bus welly = new Bus("London Bus Welly", "351", 9.5f);
        System.out.println(welly);
        welly.getPitStop(5);
        welly.getBestLapTime(41);
        welly.getMaxSpeed(100);

        Bus ikarus = new Bus("Икарус", "250.59", 10.4f);
        System.out.println(ikarus);
        ikarus.getPitStop(4.1);
        ikarus.getBestLapTime(45);
        ikarus.getMaxSpeed(100);
        System.out.println();

        // Объекты класс Truck

        Truck maz = new Truck("Маз-", "5440", 15.0f);
        System.out.println(maz);
        maz.startMoving();
        maz.finishMoving();
        maz.getPitStop(5.6);
        maz.getBestLapTime(51);
        maz.getMaxSpeed(120);

        Truck volvo = new Truck("Вольво", "FH460",14.8f);
        System.out.println(volvo);
        volvo.getPitStop(6.0);
        volvo.getBestLapTime(50);
        volvo.getMaxSpeed(125);

        Truck kamaz = new Truck("Камаз", "43118", 12.0f);
        System.out.println(kamaz);
        kamaz.getPitStop(4.5);
        kamaz.getBestLapTime(55);
        kamaz.getMaxSpeed(100);

        Truck ural = new Truck("Урал", "4320", 13.5f);
        System.out.println(ural);
        ural.getPitStop(6.4);
        ural.getBestLapTime(54);
        ural.getMaxSpeed(110);

        DriverB <Car> boris = new DriverB<>("Иванов Борис", true, 5);
        DriverC <Truck> ivan = new DriverC<>("Григорьев Иван", true, 7);
        DriverD <Bus> kiril = new DriverD<>("Серов Кирил", true,10);

        System.out.println();

        boris.fillTheCar();
        ivan.fillTheCar();
        kiril.fillTheCar();
        System.out.println();
        boris.inform(kia);
        ivan.inform(kamaz);
        kiril.inform(ikarus);
    }
}
