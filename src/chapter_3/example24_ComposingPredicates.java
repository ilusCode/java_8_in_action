package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.List;
import java.util.function.Predicate;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 92
 * 3.8.2. Composing Predicates
 */
public class example24_ComposingPredicates {
    public static void main(String[] args) {
        testExample24();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample24() {
        comentar("Capitulo 3", "Ejemplo #24", "");
        List<AppleModel> list = createList();
        InventoryData d = new InventoryData();
        d.loadData(list);
        Predicate<AppleModel> redApples = a -> "Roja".equals(a.getColor());
        Predicate<AppleModel> weightApples = a -> a.getWeight() > 12;
        System.out.println("Negate");
        /**
         * este metodo regresa una negacion del predicate que se le pasa como parametro, es decir, un false de la sentencia
         */
        showListMod(filterGen(list, redApples.negate()));
        System.out.println("---------------------------");
        System.out.println("Predicate");
        showListMod(filterGen(list, redApples));
        System.out.println("---------------------------");
        System.out.println("And");
        showListMod(filterGen(list, and(redApples, weightApples)));
        System.out.println("---------------------------");
        System.out.println("Or");
        showListMod(filterGen(list, or(redApples, weightApples)));
    }

    /**
     * en este metodo se deben de cumblir ambas sentencias, se podria ver, como un filtrado avazado
     *
     * @param p1
     * @param p2
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> and(Predicate<T> p1, Predicate<T> p2) {
        return p1.and(p2);
    }

    /**
     * en este metodo se deben de cumblir cualquiera de las dos sentencias
     *
     * @param p1
     * @param p2
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> or(Predicate<T> p1, Predicate<T> p2) {
        return p1.or(p2);
    }
}
