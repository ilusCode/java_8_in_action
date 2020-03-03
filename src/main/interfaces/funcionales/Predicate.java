package main.interfaces.funcionales;

@FunctionalInterface
public interface Predicate<T> {
    /**
     * @param t
     * @return
     */
    boolean test(T t);
}
