interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    int screenSize;

    public SmartTV(String brand, int screenSize) {
        super(brand);
        this.screenSize = screenSize;
    }

    @Override
    public void displayAppliance() {
        System.out.println("Smart TV Brand: " + brand + ", Screen Size: " + screenSize + " inches");
    }

    @Override
    public void turnOn() {
        System.out.println("Smart TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is now OFF.");
    }
}

public class Ex06_SmartHomeAppliance {
    public static void main(String[] args) {
        // Dynamic Method Dispatch using abstract class reference
        Appliance app = new SmartTV("Samsung", 55);
        app.displayAppliance();

        // Downcasting to use interface methods or calling through interface reference
        RemoteControl rc = (SmartTV) app;
        rc.turnOn();
        rc.turnOff();
    }
}