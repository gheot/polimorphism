public class DriverD <D extends Bus> extends Driver {

    public DriverD(String name, boolean drivingLicense, double experience) {
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
        System.out.println(getName() + ", необходимо заправить автобус!");
    }

    public void inform(D bus) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + bus.getBrand() + " " + bus.getModel() +
                " и будет участвовать в заезде.");
    }
}