package chapter_2;

import main.data.InventoryData;
import main.interfaces.ApplePredicate;
import main.interfaces.Predicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 41 - 42
 * 2.1. Different strategies for selecting an Apple
 */
public class example5_AppleGreenColorPredicate implements ApplePredicate {
    /**
     * este metodo sirve para asginar la sentecnia a un predicate
     *
     * @param model
     * @return regresa un true or false dependiendo si se cumple la sentencia o no
     */
    public boolean test(AppleModel model) {
        return model.getWeight() > 15;
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param list es una lista de datos
     * @param p    p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<AppleModel> filterWhitePredicate(List<AppleModel> list, Predicate<AppleModel> p) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel a : list) {
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample5() {
        System.out.println("Chapther 2");
        System.out.println("Example #5");
        InventoryData d = new InventoryData();
        List<AppleModel> list = d.creaList();
        d.cargarDatos(list);
        example5_AppleGreenColorPredicate e5 = new example5_AppleGreenColorPredicate();
        Predicate<AppleModel> p = e5::test;
        d.mostrarList(filterWhitePredicate(list, p));
    }
}
