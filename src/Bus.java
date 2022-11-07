public class Bus  extends Transport implements Competing {

    private CapacityOfPeople capacityOfPeople;
    public Bus(String brand, String model, float engineVolume,CapacityOfPeople capacityOfPeople) {
        super(brand, model, engineVolume);
        this.capacityOfPeople = capacityOfPeople;
    }
    public CapacityOfPeople getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(CapacityOfPeople capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
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
        System.out.println("Транспортное средство " + getBrand() + getModel() + " начало движение!");

    }

    @Override
    public void finishMoving() {
        System.out.println("Транспортное средство " + getBrand() + " " + getModel() + " закончило движение!");
    }

    @Override
    public void printType() {
        if (capacityOfPeople==null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() +": от " + capacityOfPeople.getFrom() + " мест до " + capacityOfPeople.getTo() + " мест.");
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
