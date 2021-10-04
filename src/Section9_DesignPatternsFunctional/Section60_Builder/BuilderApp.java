package Section9_DesignPatternsFunctional.Section60_Builder;

public class BuilderApp {
    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();

        Mobile mobile = builder.with(mobileBuilder -> mobileBuilder.ram = 4)
                .with(mobileBuilder -> mobileBuilder.battery = 4000)
                .with(mobileBuilder -> mobileBuilder.processor = "A12 Bionic").createMobile();

        System.out.println(mobile);
    }
}
