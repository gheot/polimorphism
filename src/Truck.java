public class Truck extends Transport implements Competing{

    private TypeOfCapacity typeOfCapacity;

    public Truck(String brand, String model, float engineVolume,TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineVolume);
        this.typeOfCapacity = typeOfCapacity;
    }
    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }
    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void printType() {
        if (typeOfCapacity==null) {
            System.out.println("Данных недостаточно");
        } else {
            String from = typeOfCapacity.getFrom()==null? "" : " от " + typeOfCapacity.getFrom()+ " тонн ";
            String to = typeOfCapacity.getTo()==null? "" : " до " + typeOfCapacity.getTo();
            System.out.println("Грузоподъемность авто " + getBrand() + ": " + from + to + " тонн.");
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.8;
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
