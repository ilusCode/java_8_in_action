package main.interfaces.funcionales;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
