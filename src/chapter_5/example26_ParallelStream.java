package chapter_5;

import java.util.List;
import java.util.function.BinaryOperator;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 137
 * Benefit of the reduce method and parallelism
 */
public class example26_ParallelStream {

    /**
     * este metodo realiza una suma multihilos
     *
     * @param n
     * @param bi
     * @return
     */
    private static int parallel(List<Integer> n, BinaryOperator<Integer> bi) {
        return n.parallelStream().reduce(0, bi);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample26() {
        comentar(5, 26, "");
        BinaryOperator<Integer> bi = Integer::sum;
        int sum = parallel(numbers, bi);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        testExample26();
    }
}
