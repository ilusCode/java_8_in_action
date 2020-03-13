package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 131
 * Optional in a nutshell
 */
public class example15_OptionalNutShell {
    /**
     * este metodo sirve para realizar una accion al encontrar un valor contrairio al de por defecto de un tipo de dato
     *
     * @param m
     * @param p
     * @param c
     */
    private static void nutShell(List<DishModel> m, Predicate<DishModel> p, Consumer<DishModel> c) {
        m.stream()
                .filter(p)
                .findAny()
                .ifPresent(c);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample15() {
        comentar(5, 15, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = DishModel::isVegetarian;
        Consumer<DishModel> c = d -> System.out.println(d.getName());
        nutShell(menu, p, c);
    }

    public static void main(String[] args) {
        testExample15();
    }
}
