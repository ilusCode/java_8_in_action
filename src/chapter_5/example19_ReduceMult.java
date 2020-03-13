package chapter_5;

import java.util.function.BinaryOperator;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 133
 * 5.4.1. Summing the elements
 */
public class example19_ReduceMult {
    /**
     * este metodo es una forma reducida una multiplicacion de un arreglo
     *
     * @param bi
     * @return
     */
    private static int reduceMult(BinaryOperator<Integer> bi) {
        return numbers.stream().reduce(1, bi);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample19() {
        comentar(5, 19, "");
        BinaryOperator<Integer> bi = (a, b) -> a * b;
        System.out.println("Producto: " + reduceMult(bi));
    }

    public static void main(String[] args) {
        testExample19();
    }
}
