package Section8_FunctionalInDepth.Section48_Composition;


@FunctionalInterface
public interface IFunction<T,R> {

    R apply(T t);

    default <V> IFunction<V,R> compose(IFunction<V,T> before){
        return k -> apply(before.apply(k));
    }

}
