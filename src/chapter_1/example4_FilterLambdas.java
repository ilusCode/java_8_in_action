package chapter_1;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.List;

import static chapter_1.example3_Filter.filterApples;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 27
 * 1.2.3. From passing methods to lambdas
 */
public class example4_FilterLambdas {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example4_FilterLambdas() {
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample4() {
        System.out.println("Chapther 1");
        System.out.println("Example #4");
        InventoryData d = new InventoryData();
        List<AppleModel> inv = d.creaList();
        d.cargarDatos(inv);
        System.out.println("Sentencia #1 peso menor a 15");
        d.mostrarList(filterApples(inv, (AppleModel a) -> a.getWeight() < 15));
        System.out.println("Sentencia #2 peso menor a 15 o que el color sea azul");
        d.mostrarList(filterApples(inv, (AppleModel a) -> a.getWeight() < 15 || ("azul".equals(a.getColor()) || "Azul".equals(a.getColor()))));
        System.out.println("Sentencia #3 el color debe de ser rojo");
        d.mostrarList(filterApples(inv, (AppleModel a) -> "roja".equals(a.getColor()) || "Roja".equals(a.getColor())));
    }
}
