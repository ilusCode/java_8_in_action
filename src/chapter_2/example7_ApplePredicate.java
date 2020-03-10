package chapter_2;

import main.data.InventoryData;
import main.interfaces.funcionales.Predicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 42
 * 2.2.1. Fourth attempt: filtering by abstract criteria
 */
public class example7_ApplePredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example7_ApplePredicate() {
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param list es una lista de datos
     * @param p    p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<AppleModel> filterWithPredicate(List<AppleModel> list, Predicate p) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel a : list) {
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }

    /**
     * este metodo sirve para asginar la sentecnia a un Predicate
     *
     * @param model
     * @return regresa un true or false dependiendo si se cumple la sentencia o no
     */
    public static boolean test(AppleModel model) {
        return "Verde".equals(model.getColor());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample7() {
        comentar("Capitulo 2", "Example #7", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = createList();
        d.loadData(list);
        Predicate<AppleModel> p = example7_ApplePredicate::test;
        showListMod(filterWithPredicate(list, p));
    }

    public static void main(String[] args) {
        testExample7();
    }
}
