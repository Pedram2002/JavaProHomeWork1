package homeWork7.Appliance;

public class WashMachine extends Devices {
    public  Boolean DishesAreIntro = false;
    public Boolean WashMachineIsWorkingNow = false ;

    public void turnOn() {
        if (!DishesAreIntro) {
            System.out.println("WashMachine is empty");
            return;
        }
        setOn(true);
        System.out.println("TV Is on");
    }

    public void turnOff() {
        if (!WashMachineIsWorkingNow) {
            System.out.println("WashMachine is working now? i can`t turn it off!!");
            return;
        }

        setOn(false);
        System.out.println("WashMachine Is Off");
    }

    public void HumanLefts(){
        turnOn();
    }
    public void HumanReturn(){
        turnOff();
    }

}
