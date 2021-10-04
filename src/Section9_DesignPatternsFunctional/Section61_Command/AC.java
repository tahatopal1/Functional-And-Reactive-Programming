package Section9_DesignPatternsFunctional.Section61_Command;

// Receiver class
public class AC {

    public void turnOn(){
        System.out.println("Turning on AC");
    }

    public void turnOff(){
        System.out.println("Turning off AC");
    }

    public void incTemp(){
        System.out.println("Increasing temperature");
    }

    public void decTemp(){
        System.out.println("Decreasing temperature");
    }

}
