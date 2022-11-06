import java.util.Objects;

public abstract class Driver {

    public final String name;
    public boolean drivingLicense;
    public double experience;

    public Driver(String name, boolean drivingLicense, double experience) {
        this.name = ValidationUtils.validOrDefault(name, "false");
        this.drivingLicense = drivingLicense;
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicense == driver.drivingLicense && Double.compare(driver.experience, experience) == 0 && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivingLicense, experience);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void fillTheCar();

    @Override
    public String toString() {
        return  name;
    }
}
