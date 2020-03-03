package chapter_2;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

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

    public static List<appleModel> filterApplesByColor(List<appleModel> list, String color) {
        List<appleModel> res = new ArrayList<>();
        for (appleModel am : list) {
            if (am.getColor().equals(color)) {
                res.add(am);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2() {
        comentar("Capitulo 2", "Example #2", "", "--------------------------------");
        inventoryData d = new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        List<appleModel> greenApples = filterApplesByColor(list, "Verde");
        d.mostrarList(greenApples);
        List<appleModel> redApples = filterApplesByColor(list, "Roja");
        d.mostrarList(redApples);
    }
}
