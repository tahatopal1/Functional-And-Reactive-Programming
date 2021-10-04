package Section9_DesignPatternsFunctional.Section61_Command;

public class CommandApp {
    public static void main(String[] args) {

        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();

        // By using lambda, we have avoided to create concrete classes those implement Command interface
        remote.setCommand(() -> ac1.turnOn());
        remote.buttonPressed();

        remote.setCommand(() -> ac2.incTemp());
        remote.buttonPressed();

    }
}
