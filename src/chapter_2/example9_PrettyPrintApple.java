package chapter_2;

import main.data.InventoryData;
import main.interfaces.AppleFormatter;
import main.model.AppleModel;

import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 45
 * Quiz 2.1: Write a flexible prettyPrintApple method
 */
public class example9_PrettyPrintApple {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example9_PrettyPrintApple() {
    }

    /**
     * Este metodo sirve para imprimir el color del arreglo que se recorre
     */
    static class AppleFancyFormatter implements AppleFormatter {
        public String accept(AppleModel apple) {
            return "Una manzana de color " + apple.getColor();
        }
    }

    /**
     * Este metodo sirve para imprimir el peso del arreglo que se recorre
     */
    static class AppleSimpleFormatter implements AppleFormatter {
        public String accept(AppleModel apple) {
            return "Una manzana de " + apple.getWeight() + "g";
        }
    }

    /**
     * @param list es un listado donde se esncuetra toda la informacion del arreglo
     * @param format sirve para identificar cual es sentecia por la que se va a imprimir la informacion
     */
    public static void prettyPrintApple(List<AppleModel> list, AppleFormatter format) {
        for (AppleModel apple : list) {
            System.out.println(format.accept(apple));
        }
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample9() {
        comentar("Capitulo 2", "Example #9", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = creaList();
        d.cargarDatos(list);
        prettyPrintApple(list, new AppleFancyFormatter());
        prettyPrintApple(list, new AppleSimpleFormatter());
    }

    public static void main(String[] args) {
        testExample9();
    }
}
