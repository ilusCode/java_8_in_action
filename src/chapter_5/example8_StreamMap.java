package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 123
 * 5.2.1. Applying a function to each element of a stream
 */
public class example8_StreamMap {
    private static List<Integer> countersMenu(List<DishModel> m, Function<DishModel, String> fds, Function<String, Integer> fsi) {
        return m.stream()
                .map(fds)
                .map(fsi)
                .collect(toList());
    }

    /**
     * este metodo debuelve una lisa con el tamaño de las palabras
     *
     * @param list
     * @return
     */
    private static List<Integer> counters(List<String> list) {
        return list.stream().map(String::length).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample8() {
        comentar(5, 8, "");
        System.out.println("counters");
        List<String> ls = Arrays.asList("Java", "8", "in", "in", "action");
        counters(ls).forEach(System.out::println);

        System.out.println("------------------------------\ncountersMenu");
        DishData dd = new DishData();
        dd.loadData(menu);
        Function<DishModel, String> fds = DishModel::getName;
        Function<String, Integer> fsi = String::length;
        countersMenu(menu, fds, fsi).forEach(System.out::println);
    }

    public static void main(String[] args) {
        testExample8();
    }
}
