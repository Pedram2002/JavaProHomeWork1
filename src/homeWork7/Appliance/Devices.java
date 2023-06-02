package homeWork7.Appliance;

public abstract class Devices implements  Appliance{
    private boolean isOn;

    public Devices() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}
