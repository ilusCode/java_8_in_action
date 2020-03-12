package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 123
 * 5.2.1. Applying a function to each element of a stream
 */
public class example7_StreamMap {

    /**
     * este metodo sirve para extraer un solo campo de un conjunto de objetos utilizando un {@link java.util.Map}
     *
     * @param p
     * @return
     */
    private static List<String> searchFor(Function<DishModel, String> p) {
        return menu.stream().map(p).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample7() {
        comentar(5, 7, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Function<DishModel, String> p = DishModel::getName;
        List<String> list = searchFor(p);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testExample7();
    }
}
