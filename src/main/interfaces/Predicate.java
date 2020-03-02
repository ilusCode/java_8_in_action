package main.interfaces;

@FunctionalInterface
public interface Predicate<T> {
    /**
     * @param t
     * @return
     */
    boolean test(T t);
}
