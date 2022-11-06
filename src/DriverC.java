public class DriverC <C extends Truck> extends Driver{

    public DriverC(String name, boolean drivingLicense, double experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Необходимо остановиться!");
    }

    @Override
    public void fillTheCar() {
        System.out.println(getName() + ", необходимо заправить грузовик!");
    }
    public void inform(C truck) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + truck.getBrand() + " " + truck.getModel() +
                " и будет участвовать в заезде.");
    }
}
