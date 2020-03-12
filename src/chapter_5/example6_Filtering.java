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
 * Quiz 5.1: Filtering: How would you use streams to filter the first two meat dishes?
 */

public class example6_Filtering {
    /**
     * este metodo sirve para obtener los dos primeros platos de comida de tipo MEAT de {@link DishModel.Type}
     *
     * @param m
     * @param p
     * @param i
     * @return
     */
    private static List<DishModel> filterMeat(List<DishModel> m, Predicate<DishModel> p, int i) {
        return m.stream().filter(p).limit(2).collect(Collectors.toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExmaple6() {
        comentar(5, 6, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = d -> d.getType() == DishModel.Type.MEAT;
        for (DishModel dm : filterMeat(menu, p, 1)) {
            System.out.println(dm.getName() + " - " + dm.getType());
        }
    }

    public static void main(String[] args) {
        testExmaple6();
    }
}
