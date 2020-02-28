package chapter_1.examples;

import chapter_1.model.AppleModel;
import java.util.List;
import static chapter_1.data.InventoryData.*;
import static chapter_1.examples.example3_Filter.filterApples;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 27
 * 1.2.3. From passing methods to lambdas
 */
public class example4_FilterLambdas {

    public static void testExample4() {
        System.out.println("Example #4");
        List<AppleModel> inv = creaList();
        cargarDatos(inv);
        System.out.println("Sentencia #1 peso menor a 15");
        mostrarList(filterApples(inv, (AppleModel a) -> a.getWeight() < 15));
        System.out.println("Sentencia #2 peso menor a 15 o que el color sea azul");
        mostrarList(filterApples(inv, (AppleModel a) -> a.getWeight() < 15 || ("azul".equals(a.getColor()) || "Azul".equals(a.getColor()))));
        System.out.println("Sentencia #3 el color debe de ser rojo");
        mostrarList(filterApples(inv, (AppleModel a) -> "roja".equals(a.getColor()) || "Roja".equals(a.getColor())));
    }
}
