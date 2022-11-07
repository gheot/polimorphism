import java.time.LocalDate;

public class Car extends Transport implements Competing{

    private TypeOfBody typeOfBody;
    public Car(String brand, String model, float engineVolume,TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }
    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printType() {
        if (typeOfBody==null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип кузова авто " + getBrand() + ": " + typeOfBody);
        }
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
