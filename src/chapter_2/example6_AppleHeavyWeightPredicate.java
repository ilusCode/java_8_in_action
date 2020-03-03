package chapter_2;

import main.data.inventoryData;
import main.interfaces.ApplePredicate;
import main.interfaces.funcionales.Predicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 42
 * 2.1. Different strategies for selecting an Apple
 */
public class example6_AppleHeavyWeightPredicate implements ApplePredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example6_AppleHeavyWeightPredicate() {
    }

    /**
     * este metodo sirve para asginar la sentecnia a un Predicate
     *
     * @param model
     * @return regresa un true or false dependiendo si se cumple la sentencia o no
     */
    public boolean test(appleModel model) {
        return "Verde".equals(model.getColor());
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param list es una lista de datos
     * @param p    p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<appleModel> filterWithPredicate(List<appleModel> list, Predicate<appleModel> p) {
        List<appleModel> res = new ArrayList<>();
        for (appleModel a : list) {
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
        comentar("Capitulo 2", "Example #6", "", "--------------------------------");
        inventoryData d = new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        example6_AppleHeavyWeightPredicate e6 = new example6_AppleHeavyWeightPredicate();
        Predicate<appleModel> p = e6::test;
        d.mostrarList(filterWithPredicate(list, p));
    }
}
