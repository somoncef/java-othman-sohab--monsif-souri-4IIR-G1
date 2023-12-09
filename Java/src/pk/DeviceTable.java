package pk;
import java.util.Collections;
import java.util.Comparator;

import java.util.Arrays;
import java.util.ArrayList;

public class DeviceTable {
    public Device[] devices;

    public DeviceTable(Device[] devices) {
        this.devices = devices;
    }
    public void trier(){
         Arrays.sort(devices);
    }
    public void ajouter( Device d ){
        ArrayList<Device> liste_devices = new ArrayList<Device>(Arrays.asList(devices));
        liste_devices.add(d);
        devices= liste_devices.toArray(new Device[liste_devices.size()]);
        System.out.println("device added successfully");
    }
    public void supprimer( Device d ){
        ArrayList<Device> liste_devices = new ArrayList<Device>(Arrays.asList(devices));
        liste_devices.remove(d);
        devices= liste_devices.toArray(new Device[liste_devices.size()]);
        System.out.println("device removed successfully");
    }
    public int compter(){
        int cpt= 0;
        for(Device d: devices){
            cpt++;
        }
        return cpt;
    }
    public void inverser(){
        ArrayList<Device> list_devices = new ArrayList<Device>(Arrays.asList(devices));
        Collections.reverse(list_devices);
        devices= list_devices.toArray(new Device[list_devices.size()]);
    }
    public void afficher(){
        for(Device device: devices){
            System.out.println(device.toString());
        }
    }
    public void plusGrand(){
        Arrays.sort(devices);
        System.out.println("l'element le plus grand est" + devices[devices.length-1].getPrice());
    }
    public boolean egalite(Device[] d){
        return Arrays.equals(this.devices, d);
    }

}
