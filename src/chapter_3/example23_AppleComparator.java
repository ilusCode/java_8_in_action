package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.Comparator;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 89
 * 3.7. Putting lambdas and method references into practice!
 */
public class example23_AppleComparator {

    /**
     * este metodo hace uso de implementacion de lambdas para realizar el ordeamiento
     *
     * @param x
     */
    private static void useLambdas(List<AppleModel> x) {
        System.out.println("UseLambdas");
        x.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        showListMod(x);
        System.out.println("------------------------------");
    }

    /**
     * este metodo hace uso de implementacion de una clase anonima para realizar el ordeamiento
     *
     * @param x
     */
    private static void anonymousClass(List<AppleModel> x) {
        System.out.println("AnonymusClass");
        x.sort(new Comparator<AppleModel>() {
            @Override
            public int compare(AppleModel o1, AppleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        showListMod(x);
        System.out.println("------------------------------");
    }

    /**
     * este metodo hace uso de la clase {@link Comparator} donde se le especifica el tipo de dato con el que se va
     * hacer el ordenamiento
     *
     * @param x
     */
    private static void comparing(List<AppleModel> x) {
        System.out.println("comparingReversed");
        x.sort(Comparator.comparing((AppleModel a) -> a.getWeight()));
        showListMod(x);
        System.out.println("------------------------------");
    }

    /**
     * este metodo se encarga de utilizar la prioridad, es decir, cuando dos elementos tengas el mismo valor
     * pueda comprar con otro para el ordenamiento
     *
     * @param x
     */
    private static void theComparing(List<AppleModel> x) {
        System.out.println("theComparing");
        x.sort(Comparator.comparing(AppleModel::getWeight)
                .reversed()
                .thenComparing(AppleModel::getPiece)
                .thenComparing(AppleModel::getColor));
        showListMod(x);
    }

    /**
     * este metodo realiza el ordenamiento invertido tan solo immplementando la parabla reversed
     *
     * @param x
     */
    private static void comparingReversed(List<AppleModel> x) {
        System.out.println("comparingReversed");
        x.sort(Comparator.comparing(AppleModel::getWeight).reversed());
        showListMod(x);
        System.out.println("------------------------------");
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample23() {
        comentar("Capitulo 3", "Ejemplo 23", "");
        List<AppleModel> x = creaList();
        InventoryData d = new InventoryData();
        d.loadData(x);
        System.out.println("Original");
        showListMod(x);
        System.out.println("------------------------------");
        useLambdas(x);
        anonymousClass(x);
        comparing(x);
        comparingReversed(x);
        theComparing(x);
    }

    public static void main(String[] args) {
        testExample23();
    }
}
