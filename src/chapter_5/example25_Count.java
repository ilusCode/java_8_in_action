package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.BinaryOperator;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 137
 * Quiz 5.3: Reducing
 */
public class example25_Count {

    /**
     * este metodo sirve para realizar un conteo del numero datos que tienen tu arreglo
     *
     * @param m
     * @param bi
     * @return
     */
    private static Integer mapReduce(List<DishModel> m, BinaryOperator<Integer> bi) {
        return m.stream().map(d -> 1).reduce(0, bi);
    }

    /**
     * este metodo sirve para realizar un conteo del numero datos que tienen tu arreglo
     *
     * @param m
     * @return
     */
    private static long streamCount(List<DishModel> m) {
        return m.stream().count();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample25() {
        comentar(5, 25, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        BinaryOperator<Integer> bi = (a, b) -> a + b;
        System.out.println("mapReduce " + mapReduce(menu, bi));
        System.out.println("streamCount " + streamCount(menu));
    }

    public static void main(String[] args) {
        testExample25();

    }
}
