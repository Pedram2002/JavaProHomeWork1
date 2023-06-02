package homeWork7.Appliance;

import java.util.ArrayList;

public class SmartHome {
    ArrayList<Devices> devices = new ArrayList<>();


    public void HumanLefts() {
        for (Devices div : devices) {
            div.HumanLefts();
        }
    }

    public void HumanReturns() {
        for (Devices div : devices) {
            div.HumanReturn();
        }
    }

    public boolean AddDevice(Devices device) {
        if (devices.size()>10){
            return false;
        }
        devices.add(device);
        return true;
    }

    public boolean RemoveDevice(Devices device) {
     return    devices.remove(device);
    }

}
