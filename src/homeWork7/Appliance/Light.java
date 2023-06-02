package homeWork7.Appliance;

public class Light extends Devices {
    public void turnOn() {
        setOn(true);
        System.out.println("TV Is on");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("TV Is Off");
    }

    public void HumanLefts(){
        turnOff();
    }
    public void HumanReturn(){
        turnOn();
    }
}
