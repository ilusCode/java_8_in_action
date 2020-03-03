package chapter_3;

import main.interfaces.funcionales.Function;

import java.util.Arrays;
import java.util.List;

import static main.Genericos.*;

public class example8_Function {
    public static void main(String[] args) {
        List<Integer> l = apply(Arrays.asList("lambdas", "in", "acion"), (String s) -> s.length());
        List<Integer> l2 = apply(Arrays.asList("lambdas", "in", "acion"), (String::length));
        List<Integer> l3 = creaList();

        mostrarList(l);
        mostrarList(l2);
    }
}
