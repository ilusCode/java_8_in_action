package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 120
 * 5.1.3. Truncating a stream
 */
public class example4_Truncating {

    /**
     * este metodo sirve para limitar los resultados d eun filtrado
     *
     * @param m
     * @param predicate
     * @param limit
     * @return
     */
    private static List<DishModel> truncating(List<DishModel> m, Predicate<DishModel> predicate, int limit) {
        return m.stream().filter(predicate).limit(limit).collect(Collectors.toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample4() {
        comentar(5, 3, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = d -> d.getCalories() < 300;
        for (DishModel l : truncating(menu, p, 3)) {
            System.out.println(l.getName() + " - " + l.getCalories());
        }
    }

    public static void main(String[] args) {
        testExample4();
    }
}
