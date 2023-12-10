package pk;
import java.util.*;

public class DeviceList {
    private List<Device> deviceList;

    public DeviceList() {
        this.deviceList = new ArrayList<>();
    }


    public void ajouterDevice(Device device) {
        deviceList.add(device);
    }


    public void afficherList() {
        for (Device device : deviceList) {
            System.out.println(device);
        }
    }


    public void iterateList() {
        Iterator<Device> iterator = deviceList.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            System.out.println(device);
        }
    }


    public void insererDevice(int index, Device device) {
        deviceList.add(index, device);
    }


    public Device getDevice(int index) {
        return deviceList.get(index);
    }


    public void removeDevice(Device device) {
        deviceList.remove(device);
    }


    public boolean chercherDevice(Device device) {
        return deviceList.contains(device);
    }


    public void sortList() {
        Collections.sort(deviceList);
    }


    public Device[] copyListToArray() {
        return deviceList.toArray(new Device[0]);
    }


    public void shuffleList() {
        Collections.shuffle(deviceList);
    }


    public void reverseList() {
        Collections.reverse(deviceList);
    }


    public List<Device> extractSubList(int fromIndex, int toIndex) {
        return deviceList.subList(fromIndex, toIndex);
    }


    public boolean compareLists(List<Device> otherList) {
        return deviceList.equals(otherList);
    }


    public void swapElements(int index1, int index2) {
        Collections.swap(deviceList, index1, index2);
    }


    public void clearList() {
        deviceList.clear();
    }


    public boolean isListEmpty() {
        return deviceList.isEmpty();
    }
}
