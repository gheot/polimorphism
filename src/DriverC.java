public class DriverC extends Driver <Truck>{

    public DriverC(String name, String drivingLicense, int experience, Truck car) {
        super(name, drivingLicense, experience, car);
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
        System.out.println(this.getName()+ ", водитель категории " + this.getDrivingLicense() + " начал движение!");
        this.getCar().startMoving();
    }

    @Override
    public void stopMoving() {
        System.out.println(this.getName()+ ", водитель категории " + this.getDrivingLicense() + " остановился!");
        this.getCar().finishMoving();

    }

    @Override
    public void fillTheCar() {
        System.out.println(this.getName() + ", необходимо заправить " + this.getCar().getBrand()+ " "
                + this.getCar().getModel());

    }

    @Override
    public void getMessage() {
        System.out.println("Водитель " + getName() + " (категория " + getDrivingLicense()+ ") управляет автомобилем " +
                car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде!");
    }
}
