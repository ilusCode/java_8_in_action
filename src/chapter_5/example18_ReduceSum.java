package chapter_5;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 133
 * 5.4.1. Summing the elements
 */
public class example18_ReduceSum {

    /**
     * este metodo es una forma reducida de sumar un arreglo
     *
     * @return
     */
    public static int reduceSum() {
        int o = 0;
        return numbers.stream().reduce(o, (a, b) -> a + b);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample18() {
        comentar(5, 18, "");
        System.out.println(reduceSum());
    }

    public static void main(String[] args) {
        testExample18();
    }
}
