public class Device {
    String deviceId;
    Boolean status;

    Device(String deviceId, Boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    String temperatureSetting;

    Thermostat(String temperatureSetting, String deviceId, Boolean status) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;

    }

    void displayStatus() {
        System.out.println("Device ID:" + deviceId);
        System.out.println("Status :" + status);
        System.out.println("Tempetrature Setting :" + temperatureSetting);
    }

}

class main {
    public static void main(String[] args) {
        Thermostat ts = new Thermostat("Celcius", "12345", true);
        ts.displayStatus();
    }

}
