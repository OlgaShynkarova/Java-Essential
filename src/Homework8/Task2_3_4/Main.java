package Homework8.Task2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120,"AB1234567CD");
        Device device1 = new Device("Samsung", 120,"AB1234567CD");
        Device device2 = new Device("HP", 150,"AC1234867CD");
        Device device3 = device1;
        Monitor monitor = new Monitor(device.getManufacturer(), device.getPrice(), device.getSerialNumber(), 1280, 1024);
        Monitor monitor1 = new Monitor(device.getManufacturer(), device.getPrice(), device.getSerialNumber(), 1280, 1024);
        Monitor monitor2 = new Monitor(device2.getManufacturer(), device2.getPrice(), device2.getSerialNumber(), 1400, 1380);
        Monitor monitor3 = monitor1;
        System.out.println(device);
        System.out.println(monitor);
        EthernetAdapter adapter = new EthernetAdapter(device.getManufacturer(), device.getPrice(), device.getSerialNumber(),  180, "RT");
        EthernetAdapter adapter1 = new EthernetAdapter(device.getManufacturer(), device.getPrice(), device.getSerialNumber(),  180, "RT");
        EthernetAdapter adapter2 = new EthernetAdapter(device2.getManufacturer(), device2.getPrice(), device2.getSerialNumber(),  200, "RM");
        EthernetAdapter adapter3 = adapter1;
        compareObjects(device, device1, device2, device3);
        System.out.println("---------------------");
        compareObjects(monitor, monitor1, monitor2, monitor3);
        System.out.println("---------------------");
        compareObjects(adapter, adapter1, adapter2, adapter3);
    }
    static void compareObjects(Object object1, Object object2, Object object3, Object object4){
        Object[] objects = new Object[]{object1, object2, object3, object4};
            System.out.println(object1.equals(object2));
            System.out.println(object1.equals(object3));
            System.out.println(object4.equals(object2));
            System.out.println(object1 == object2);
            System.out.println(object1 == object3);
            System.out.println(object4 == object2);
            System.out.println(object1.hashCode());
            System.out.println(object2.hashCode());
            System.out.println(object3.hashCode());
            System.out.println(object4.hashCode());
        }
    }