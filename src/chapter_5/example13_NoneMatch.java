package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Predicate;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 130
 * noneMatch
 */
public class example13_NoneMatch {
    /**
     * este metodo sirve para valida que no se cumpla la sentencia {@link Predicate}, es decir, lo contrario de allMatch
     *
     * @param m
     * @return
     */
    private static boolean noneMatch(List<DishModel> m, Predicate<DishModel> p) {
        return m.stream().noneMatch(p);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample13() {
        comentar(5, 13, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        if (noneMatch(menu, d -> d.getCalories() >= 100)) {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        testExample13();
    }

}
