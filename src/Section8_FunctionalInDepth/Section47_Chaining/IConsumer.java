package Section8_FunctionalInDepth.Section47_Chaining;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface IConsumer<T> {

    void accept(T t);

    default IConsumer<T> thenAccept(IConsumer<T> next){

        // From now on, next is not allowed to be null!!!
        Objects.requireNonNull(next);

        return t -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
