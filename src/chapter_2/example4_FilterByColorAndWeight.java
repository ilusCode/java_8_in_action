package chapter_2;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 40
 * 2.1.3. Third attempt: filtering with every attribute you can think of
 */
public class example4_FilterByColorAndWeight {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example4_FilterByColorAndWeight() {
    }

    /**
     * Este metodo realiza un filtrado dependiendo a una $flag$
     *
     * @param list   es una lista donde se encuentra los datos con los que se van a trabajar
     * @param color  parametro para realiar el filtrado de tipo String
     * @param weight parametro para realiar el filtrado de tipo int
     * @param flag   parametro para realiar el filtrado de tipo boolean
     * @return regresa una lista del filtrado
     */
    public static List<AppleModel> filterApples(List<AppleModel> list, String color, int weight, boolean flag) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel am : list) {
            if ((flag && am.getColor().equals(color)) || (!flag && am.getWeight() > weight)) {
                res.add(am);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample4() {
        comentar("Capitulo 2", "Example #4", "");
        InventoryData d=new InventoryData();
        List<AppleModel> list = creaList();
        d.cargarDatos(list);
        List<AppleModel> greenApple = filterApples(list, "Verde", 0, true);
        d.mostrarList(greenApple);
        List<AppleModel> heavyApple = filterApples(list, "", 15, false);
        d.mostrarList(heavyApple);
    }

    public static void main(String[] args) {
        testExample4();
    }
}
