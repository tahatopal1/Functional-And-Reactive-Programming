package Section8_FunctionalInDepth.Section43_HigherOrderFunctions;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        //IFactory<Integer> factory = createFactory(() -> Math.random() * 100, Double::intValue);
        //Integer product = factory.create();
        Optional.of(
                createFactory(() -> Math.random() * 100, Double::intValue).create())
                    .ifPresent(System.out::println);
    }

    public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
        return () ->  configurator.configure(producer.produce());
    }

}
