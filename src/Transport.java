import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private float engineVolume;


    public Transport(String brand, String model, float engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "false");
        this.model = ValidationUtils.validOrDefault(model, "false");
        setEngineVolume(engineVolume);
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0.0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.0f;
        }

    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();

    public abstract void finishMoving();
    public abstract void printType();

    @Override
    public String toString() {
        return  this.brand + " " + this.model +
                ", объём двигателя - " + this.engineVolume +
                ".";
    }

}
