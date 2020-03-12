package chapter_3;

import main.model.AppleModel;

import java.util.Comparator;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 57
 * 3.1. Lambdas in a nutshell
 */
public class example1_Lambdas {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example1_Lambdas() {
    }

    /**
     * este metodo hace uso de los metodos tradicionales
     *
     * @return
     */
    public static Comparator<AppleModel> comparator() {
        return new Comparator<AppleModel>() {
            @Override
            public int compare(AppleModel o1, AppleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };
    }

    /**
     * este metodo esta implementando lambdas
     *
     * @return
     */
    public static Comparator<AppleModel> comparatorWithLambdas() {
        return (AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample1() {
        comentar(3, 1, "");
        Comparator<AppleModel> byWeight = comparator();
        Comparator<AppleModel> byLambdas = comparatorWithLambdas();
    }

    public static void main(String[] args) {
        testExample1();
    }
}
