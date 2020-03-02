package chapter_2;

import main.data.InventoryData;
import main.interfaces.ApplePredicate;
import main.interfaces.Predicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 42
 * 2.1. Different strategies for selecting an Apple
 */
public class example6_AppleHeavyWeightPredicate implements ApplePredicate {
    /**
     * este metodo sirve para asginar la sentecnia a un predicate
     *
     * @param model
     * @return regresa un true or false dependiendo si se cumple la sentencia o no
     */
    public boolean test(AppleModel model) {
        return "Verde".equals(model.getColor());
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param list es una lista de datos
     * @param p    p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<AppleModel> filterWithPredicate(List<AppleModel> list, Predicate<AppleModel> p) {
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
    public static void testExample6() {
        System.out.println("Chapther 2");
        System.out.println("Example #6");
        InventoryData d = new InventoryData();
        List<AppleModel> list = d.creaList();
        d.cargarDatos(list);
        example6_AppleHeavyWeightPredicate e6 = new example6_AppleHeavyWeightPredicate();
        Predicate<AppleModel> p = e6::test;
        d.mostrarList(filterWithPredicate(list, p));
    }
}
