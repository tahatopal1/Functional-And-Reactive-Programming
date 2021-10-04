package Section8_FunctionalInDepth.Section43_HigherOrderFunctions;

public interface IConfigurator<T,R> {
    R configure(T t);
}
