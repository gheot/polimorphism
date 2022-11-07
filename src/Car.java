import java.time.LocalDate;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
        System.out.println("Транспортное средство " + getBrand() + " " + getModel() + " начало движение!");

    }

    @Override
    public void finishMoving() {
        System.out.println("Транспортное средство " + getBrand() + " " + getModel() + " закончило движение!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getPitStop(double pitStop) {
        System.out.println("Пит стоп - " + pitStop + " с.");
    }

    @Override
    public void getBestLapTime(double bestLapTime) {
        System.out.println("Лучшее время круга - " + bestLapTime + " с.");
    }

    @Override
    public void getMaxSpeed(double maxSpeed) {
        System.out.println("Максимальная скорость - " + maxSpeed + " с.");
    }
}
