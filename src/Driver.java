import java.util.Objects;

public abstract class Driver <T extends Transport & Competing>{

    public final String name;
    public String drivingLicense;
    public int experience;
    public final T car;

    public Driver(String name, String drivingLicense, int experience,T car) {
        this.name = ValidationUtils.validOrDefault(name, "false");
        setDrivingLicense(drivingLicense);
        setExperience(experience);
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }
    public T getCar() {
        return car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(drivingLicense, driver.drivingLicense) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivingLicense, experience, car);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void fillTheCar();

    public abstract void getMessage();
}
