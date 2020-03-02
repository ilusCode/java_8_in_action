package chapter_2;

import main.data.InventoryData;
import main.interfaces.AppleFormatter;
import main.model.AppleModel;

import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 45
 * Quiz 2.1: Write a flexible prettyPrintApple method
 */
public class example9_PrettyPrintApple {

    static class AppleFancyFormatter implements AppleFormatter {
        public String accept(AppleModel apple) {
            String characteristic = apple.getWeight() > 10 ? "Peso" : "Ligera";
            return "Una " + characteristic + " " + apple.getColor() + " manzana";
        }
    }

    static class AppleSimpleFormatter implements AppleFormatter {
        public String accept(AppleModel apple) {
            return "Una manzana de " + apple.getWeight() + "g";
        }
    }

    public static void prettyPrintApple(List<AppleModel> inventory, AppleFormatter formatter) {
        for (AppleModel apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        InventoryData d = new InventoryData();
        List<AppleModel> list = d.creaList();
        d.cargarDatos(list);
        prettyPrintApple(list, new AppleFancyFormatter());
        prettyPrintApple(list, new AppleSimpleFormatter());
    }

}
