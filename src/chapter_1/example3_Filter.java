package chapter_1;

import main.data.InventoryData;
import main.model.AppleModel;
import main.interfaces.Predicate;
import java.util.ArrayList;
import java.util.List;

import static main.data.InventoryData.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 25
 * 1.2.2. Passing code: an example
 */
public class example3_Filter {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example3_Filter() {
    }

    /**
     * Este metodo realiza un filtrado por medio del color verde
     *
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return una lista en donde se eñ bjeto en el campo color es verde
     */
    public static List<AppleModel> filterApplesGreen(List<AppleModel> list) {
        List<AppleModel> res = new ArrayList();
        for (AppleModel apple : list) {
            if ("Verde".equals(apple.getColor())) {
                res.add(apple);
            }
        }
        return res;
    }

    /**
     * Este metodo realiza un filtrado por medio del peso
     *
     * @param inv es una lista donde se encuentra los datos con los que se van a trabajar
     * @return una lista en donde se eñ bjeto en el campo color es verde
     */
    public static List<AppleModel> filterHeavyApples(List<AppleModel> inv) {
        List<AppleModel> res = new ArrayList();
        for (AppleModel apple : inv) {
            if (apple.getWeight() < 5) {
                res.add(apple);
            }
        }
        return res;
    }

    /**
     * Este metodo realiza la funcion de filtrado por color usando lambdas
     *
     * @param a es un obejto de tipo AppleModel
     * @return
     */
    public static boolean isGreenApple(AppleModel a) {
        return "Verde".equals(a.getColor()) || "verde".equals(a.getColor());
    }

    /**
     * Este metodo realiza la funcion de filtrado por peso usando lambdas
     *
     * @param a es un obejto de tipo AppleModel
     * @return
     */
    public static boolean isHeavyApples(AppleModel a) {
        return a.getWeight() < 15;
    }


    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param inv es una lista de datos
     * @param p   p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    static List<AppleModel> filterApples(List<AppleModel> inv, Predicate<AppleModel> p) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel a : inv) {
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample3() {
        System.out.println("Chapther 1");
        System.out.println("Example #3");
        InventoryData d=new InventoryData();
        List<AppleModel> inv = d.creaList();
        d.cargarDatos(inv);
        List<AppleModel> filterGreen = filterApplesGreen(inv);
        d.mostrarList(filterGreen);
        System.out.println("----------------------------- isGreenApple -----------------------------");
        List<AppleModel> ga = filterApples(inv, example3_Filter::isGreenApple);
        d.mostrarList(ga);
        System.out.println("----------------------------- isHeavyApples -----------------------------");
        List<AppleModel> ha = filterApples(inv, example3_Filter::isHeavyApples);
        d.mostrarList(ha);
    }
}
