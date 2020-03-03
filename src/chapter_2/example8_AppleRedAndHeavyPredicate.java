package chapter_2;

import main.data.inventoryData;
import main.interfaces.ApplePredicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 43
 * Passing code/behavior
 */
public class example8_AppleRedAndHeavyPredicate implements ApplePredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example8_AppleRedAndHeavyPredicate() {
    }

    public boolean test(appleModel apple) {
        return "Verde".equals(apple.getColor()) && apple.getWeight() > 15;
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param inv es una lista de datos
     * @param p   p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    public static List<appleModel> filterApples(List<appleModel> inv, ApplePredicate p) {
        List<appleModel> res = new ArrayList<>();
        for (appleModel a : inv) {
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample8() {
        comentar("Capitulo 2", "Example #8", "", "--------------------------------");
        inventoryData d = new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        List<appleModel> redAndHeavyApples = filterApples(list, new example8_AppleRedAndHeavyPredicate());
        d.mostrarList(redAndHeavyApples);
    }
}
