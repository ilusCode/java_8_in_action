package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 122
 * Figure 5.4. Skipping elements in a stream
 */
public class example5_Skip {

    /**
     * este metodo sirve paara omitir los primeros valores de una lista
     *
     * @param m
     * @param p
     * @param i
     * @return
     */
    private static List<DishModel> skip(List<DishModel> m, Predicate<DishModel> p, int i) {
        return m.stream().filter(p).skip(1).limit(1).collect(Collectors.toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample5() {
        comentar(5, 5, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = d -> d.getCalories() < 300;
        for (DishModel l : skip(menu, p, 3)) {
            System.out.println(l.getName() + " - " + l.getCalories());
        }
    }

    public static void main(String[] args) {
        testExample5();
    }
}
