package Section9_DesignPatternsFunctional.Section60_Builder;

public class Mobile {

    // We kept all these properties as final in order to make objects immutable

    final int ram;
    final int storage;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.ram;
        this.storage = mobileBuilder.storage;
        this.battery = mobileBuilder.battery;
        this.camera = mobileBuilder.camera;
        this.processor = mobileBuilder.processor;
        this.screenSize = mobileBuilder.screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
