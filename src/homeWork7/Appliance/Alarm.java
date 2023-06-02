package homeWork7.Appliance;

public class Alarm extends Devices {
    public void Alarm() {
        turnOff();
    }

    public void turnOn() {
        setOn(true);
        System.out.println("Alarm Is on");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("Alarm Is Off");
    }

    public void HumanLefts(){
        turnOn();
    }
    public void HumanReturn(){
        turnOff();
    }
}
