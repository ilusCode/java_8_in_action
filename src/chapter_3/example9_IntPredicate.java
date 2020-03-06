package chapter_3;

import main.interfaces.funcionales.IntPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 73
 * Primitive specializations
 */
public class example9_IntPredicate {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example9_IntPredicate() {
    }

    /**
     * este metodo hace uso de la implementacion de IntPredicate
     *
     * @return regresa un valor true o false dependiendo a la sentencia que se le indique
     */
    public static IntPredicate useIntPredicate() {
        return (int i) -> i % 2 == 0;
    }

    /**
     * Esta estructura esta incorrecta ya que Predica trabaja con cadenas de texto y intPredicate trabaja con valores numericos
     * public static void noDounf() {
     *         Predicate<IntPredicate> oddNumber = (Integer i) -> i % 2 == 1;
     *         oddNumber.test(1000);
     *     }
     */


    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample9() {
        List<Integer> list = new ArrayList<>();
        for (int i = 300; i < 400; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + useIntPredicate().test(i) + " - " + i % 2);
        }
    }

    public static void main(String[] args) {
        testExample9();
    }
}
