package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.stream.Collectors;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 118
 * Chapter 5. Working with streams
 */
public class example1_Iteration {

    /**
     * este metodo sirve para realizar una iteracion interna
     *
     * @param menu
     * @return
     */
    public static List<DishModel> internal(List<DishModel> menu) {
        return menu.stream().filter(DishModel::isVegetarian).collect(Collectors.toList());
    }

    /**
     * este metodo sirve para realizar una iteracion externa con un for
     *
     * @param menu
     * @return
     */
    public static List<DishModel> external(List<DishModel> menu) {
        List<DishModel> dm = createList();
        for (DishModel d : menu) {
            if (d.isVegetarian()) {
                dm.add(d);
            }
        }
        return dm;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample1() {
        comentar(5, 1, "");
        DishData d = new DishData();
        d.loadData(menu);
        System.out.println("external");
        for (DishModel dme : external(menu)) {
            System.out.println(dme.getName());
        }
        System.out.println("-------------------------------------\n" + "internal");
        for (DishModel dmi : internal(menu)) {
            System.out.println(dmi.getName());
        }
    }

    public static void main(String[] args) {
        testExample1();
    }
}
