package chapter_2;

import main.data.inventoryData;
import main.interfaces.appleFormatter;
import main.model.appleModel;

import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 45
 * Quiz 2.1: Write a flexible prettyPrintApple method
 */
public class example9_PrettyPrintApple {

    /**
     * Este metodo sirve para imprimir el color del arreglo que se recorre
     */
    static class AppleFancyFormatter implements appleFormatter {
        public String accept(appleModel apple) {
            return "Una manzana de color " + apple.getColor();
        }
    }

    /**
     * Este metodo sirve para imprimir el peso del arreglo que se recorre
     */
    static class AppleSimpleFormatter implements appleFormatter {
        public String accept(appleModel apple) {
            return "Una manzana de " + apple.getWeight() + "g";
        }
    }

    /**
     * @param list es un listado donde se esncuetra toda la informacion del arreglo
     * @param format sirve para identificar cual es sentecia por la que se va a imprimir la informacion
     */
    public static void prettyPrintApple(List<appleModel> list, appleFormatter format) {
        for (appleModel apple : list) {
            System.out.println(format.accept(apple));
        }
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample9() {
        inventoryData d = new inventoryData();
        List<appleModel> list = d.creaList();
        d.cargarDatos(list);
        prettyPrintApple(list, new AppleFancyFormatter());
        prettyPrintApple(list, new AppleSimpleFormatter());
    }
}
