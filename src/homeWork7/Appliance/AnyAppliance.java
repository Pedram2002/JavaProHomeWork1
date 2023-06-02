package homeWork7.Appliance;

public class AnyAppliance extends Devices {
    public void turnOn() {
        setOn(true);
        System.out.println("Devices Is on");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("Devices Is Off");
    }
    public void HumanLefts(){
        turnOff();
    }
    public void HumanReturn(){
        turnOn();
    }
}
