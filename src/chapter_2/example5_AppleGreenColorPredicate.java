package chapter_2;

import main.data.inventoryData;
import main.interfaces.applePredicate;
import main.interfaces.funcionales.predicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 41 - 42
 * 2.1. Different strategies for selecting an Apple
 */
public class example5_AppleGreenColorPredicate implements applePredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example5_AppleGreenColorPredicate() {
    }

    /**
     * este metodo sirve para asginar la sentecnia a un predicate
     *
     * @param model
     * @return regresa un true or false dependiendo si se cumple la sentencia o no
     */
    public boolean test(appleModel model) {
        return model.getWeight() > 15;
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param list es una lista de datos
     * @param p    p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<appleModel> filterWhitePredicate(List<appleModel> list, predicate<appleModel> p) {
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
    public static void testExample5() {
        comentar("Capitulo 2", "Example #5", "", "--------------------------------");
        inventoryData d = new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        example5_AppleGreenColorPredicate e5 = new example5_AppleGreenColorPredicate();
        predicate<appleModel> p = e5::test;
        d.mostrarList(filterWhitePredicate(list, p));
    }
}
