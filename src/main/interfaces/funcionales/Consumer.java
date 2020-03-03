package main.interfaces.funcionales;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
