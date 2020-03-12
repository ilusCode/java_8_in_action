package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 119
 * 5.1.1. Filtering with a predicate
 */
public class example2_FilteringPredicate {

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2() {
        DishData dd = new DishData();
        dd.loadData(menu);
        comentar(5, 2, "");
        Predicate<DishModel> p = DishModel::isVegetarian;
        for (DishModel d : filtering(menu, p)) {
            System.out.println(d.getName());
        }
    }

    /**
     * este metodo sirve para realizar un filtrado por medio de una sentencia {@link Predicate}
     *
     * @param m
     * @param p
     * @return
     */
    public static List<DishModel> filtering(List<DishModel> m, Predicate<DishModel> p) {
        return m.stream().filter(p).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        testExample2();
    }
}
