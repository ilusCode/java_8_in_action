package main.interfaces.funcionales;

@FunctionalInterface
public interface predicate<T> {
    /**
     * @param t
     * @return
     */
    boolean test(T t);
}
