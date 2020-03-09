package main.interfaces.funcionales;
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
