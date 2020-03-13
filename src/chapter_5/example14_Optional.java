package chapter_5;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static main.Genericos.comentar;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 130, 131
 * 5.3.3. Finding an element
 */
public class example14_Optional {

    /**
     * este metodo sirve para validar si un valor es nulo o que si cumple con la sentencia que se manda con el {@link Predicate}
     *
     * @param menu
     * @param p
     * @return
     */
    private static Optional<DishModel> validaNull(List<DishModel> menu, Predicate<DishModel> p) {
        return menu.stream().filter(p).findAny();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample14() {
        comentar(5, 14, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = DishModel::isVegetarian;
        Optional<DishModel> op = validaNull(menu, p);
        System.out.println(op.get().getName());
    }

    public static void main(String[] args) {
        testExample14();
    }
}
