package chapter_3;

import main.model.appleModel;

import java.util.Comparator;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 57
 * 3.1. Lambdas in a nutshell
 */
public class example1_Lambdas {

    /**
     * este metodo hace uso de los metodos tradicionales
     *
     * @return
     */
    public static Comparator<appleModel> comparator() {
        return new Comparator<appleModel>() {
            @Override
            public int compare(appleModel o1, appleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };
    }

    /**
     * este metodo esta implementando lambdas
     *
     * @return
     */
    public static Comparator<appleModel> comparatorWithLambdas() {
        return (appleModel a1, appleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample1() {
        comentar("Capitulo 3", "Example #1", "", "--------------------------------");
        Comparator<appleModel> byWeight = comparator();
        Comparator<appleModel> byLambdas = comparatorWithLambdas();
    }
}
