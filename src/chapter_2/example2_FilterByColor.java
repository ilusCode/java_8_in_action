package chapter_2;

import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.data.InventoryData.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 39
 * 2.1.2. Second attempt: parameterizing the color
 */
public class example2_FilterByColor {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example2_FilterByColor() {
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2() {
        System.out.println("Chapther 2");
        System.out.println("Example #2");
        List<AppleModel> list = creaList();
        cargarDatos(list);
        List<AppleModel> greenApples = filterApplesByColor(list,"Verde");
        mostrarList(greenApples);
        List<AppleModel> redApples = filterApplesByColor(list,"Roja");
        mostrarList(redApples);
    }

    public static List<AppleModel> filterApplesByColor(List<AppleModel> list, String color) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel am : list) {
            if (am.getColor().equals(color)){
                res.add(am);
            }
        }
        return res;
    }
}
