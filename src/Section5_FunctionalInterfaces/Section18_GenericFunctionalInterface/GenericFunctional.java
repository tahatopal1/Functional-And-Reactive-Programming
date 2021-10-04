package Section5_FunctionalInterfaces.Section18_GenericFunctionalInterface;

@FunctionalInterface
public interface GenericFunctional<T, R> {

    R execute(T t);

}
