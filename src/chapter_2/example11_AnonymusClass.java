package chapter_2;

import main.data.InventoryData;
import main.interfaces.ApplePredicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

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
     * Este metodo hace uso de la interface as en donde al mandar a llamar al metodo se especifica la sentencia que se debe de cumplir
     *
     * @param inv es una lista de datos
     * @param p   p.test comprueba si la sentencia es cumplida o no retornando un true o false
     * @return regresa una lista de datos con los datos que cumplen la sentencia as
     */
    public static List<AppleModel> filterApples(List<AppleModel> inv, ApplePredicate p) {
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
    public static void testExamole11() {
        comentar("Capitulo 2", "Example #11", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = createList();
        d.loadData(list);
        List<AppleModel> redApples = filterApples(list, new ApplePredicate() {
            @Override
            public boolean test(AppleModel apple) {
                return "Roja".equals(apple.getColor());
            }
        });
        showListMod(redApples);
    }

    public static void main(String[] args) {
        testExamole11();
    }
}
