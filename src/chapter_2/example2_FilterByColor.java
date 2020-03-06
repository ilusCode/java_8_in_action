package chapter_2;

import main.data.InventoryData;
import main.model.AppleModel;

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

    public static List<AppleModel> filterApplesByColor(List<AppleModel> list, String color) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel am : list) {
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
        comentar("Capitulo 2", "Example #2", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = creaList();
        d.cargarDatos(list);
        List<AppleModel> greenApples = filterApplesByColor(list, "Verde");
        d.mostrarList(greenApples);
        List<AppleModel> redApples = filterApplesByColor(list, "Roja");
        d.mostrarList(redApples);
    }

    public static void main(String[] args) {
        testExample2();
    }
}
