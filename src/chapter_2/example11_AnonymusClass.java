package chapter_2;

import main.data.inventoryData;
import main.interfaces.applePredicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 49
 * 2.3.2. Fifth attempt: using an anonymous class
 */
public class example11_AnonymusClass {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example11_AnonymusClass() {
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExamole11() {
        inventoryData d = new inventoryData();
        List<appleModel> list = d.creaList();
        d.cargarDatos(list);
        List<appleModel> redApples = filterApples(list, new applePredicate() {
            @Override
            public boolean test(appleModel apple) {
                return "Roja".equals(apple.getColor());
            }
        });
        d.mostrarList(redApples);
    }

    /**
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param inv es una lista de datos
     * @param p   p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    public static List<appleModel> filterApples(List<appleModel> inv, applePredicate p) {
        List<appleModel> res = new ArrayList<>();
        for (appleModel a : inv) {
            if (p.test(a)) {
                res.add(a);
            }
        }
        return res;
    }
}
