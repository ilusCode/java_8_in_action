package chapter_2;

import main.data.inventoryData;
import main.interfaces.applePredicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.Genericos.comentar;

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

    private List<appleModel> heavyApples;

    static class AppleHeavyWeightPredicate implements applePredicate {
        @Override
        public boolean test(appleModel apple) {
            return apple.getWeight() > 10;
        }
    }

    static class AppleGrayColorPredicate implements applePredicate {
        @Override
        public boolean test(appleModel apple) {
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
    public static List<appleModel> filterApples(List<appleModel> inv, applePredicate p) {
        List<appleModel> res = new ArrayList<>();
        for (appleModel a : inv) {
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
        comentar("Capitulo 2", "Example #10", "", "--------------------------------");
        List<appleModel> list = Arrays.asList(
                new appleModel(12, "Gris", 12),
                new appleModel(132, "Azul", 121),
                new appleModel(19, "Roja", 1));
        inventoryData d = new inventoryData();
        System.out.println("--------------------------- AppleGrayColorPredicate ---------------------------");
        List<appleModel> heavyApples = filterApples(list, new AppleGrayColorPredicate());
        d.mostrarList(heavyApples);
        System.out.println("--------------------------- AppleHeavyWeight predicate ---------------------------");
        List<appleModel> greenApples = filterApples(list, new AppleHeavyWeightPredicate());
        d.mostrarList(greenApples);
    }

}
