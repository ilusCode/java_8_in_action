package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 136
 * Quiz 5.3: Reducing
 */
public class example24_StreamMap {

    /**
     * este metodo sirve para ingresar a un objeto realizar una suma de los valores que tenga ese arreglo en una variable
     * especifica
     *
     * @param menu
     * @return
     */
    private static int streamMap(List<DishModel> menu) {
        return menu.stream().map(d -> d.getCalories()).reduce(0, (a, b) -> a + b);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample24() {
        comentar(5, 24, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        System.out.println(streamMap(menu));
    }

    public static void main(String[] args) {
        testExample24();
    }
}
