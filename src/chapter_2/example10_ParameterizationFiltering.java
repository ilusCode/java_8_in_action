package chapter_2;

import main.data.InventoryData;
import main.interfaces.ApplePredicate;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.showListMod;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 45
 * Listing 2.1. Behavior parameterization: filtering apples with predicates
 */
public class example10_ParameterizationFiltering {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example10_ParameterizationFiltering() {

    }

    static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(AppleModel apple) {
            return apple.getWeight() > 10;
        }
    }

    static class AppleGrayColorPredicate implements ApplePredicate {
        @Override
        public boolean test(AppleModel apple) {
            return "Gris".equals(apple.getColor());
        }
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
    public static void testExample10() {
        comentar("Capitulo 2", "Example #10", "");
        List<AppleModel> list = Arrays.asList(
                new AppleModel(12, "Gris", 12),
                new AppleModel(132, "Azul", 121),
                new AppleModel(19, "Roja", 1));
        InventoryData d = new InventoryData();
        System.out.println("--------------------------- AppleGrayColorPredicate ---------------------------");
        List<AppleModel> heavyApples = filterApples(list, new AppleGrayColorPredicate());
        showListMod(heavyApples);
        System.out.println("--------------------------- AppleHeavyWeight Predicate ---------------------------");
        List<AppleModel> greenApples = filterApples(list, new AppleHeavyWeightPredicate());
        showListMod(greenApples);
    }

    public static void main(String[] args) {
        testExample10();
    }
}
