package chapter_2;

import main.data.InventoryData;
import main.interfaces.ApplePredicate;
import main.interfaces.funcionales.Predicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 41 - 42
 * 2.1. Different strategies for selecting an Apple
 */
public class example5_AppleGreenColorPredicate implements ApplePredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example5_AppleGreenColorPredicate() {
    }

    /**
     * este metodo sirve para asginar la sentecnia a un Predicate
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
        comentar(2, 5, "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = createList();
        d.loadData(list);
        example5_AppleGreenColorPredicate e5 = new example5_AppleGreenColorPredicate();
        Predicate<AppleModel> p = e5::test;
        showListMod(filterWhitePredicate(list, p));
    }

    public static void main(String[] args) {
        testExample5();
    }
}
