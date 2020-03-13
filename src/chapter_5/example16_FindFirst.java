package chapter_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 132
 * 5.3.4. Finding the first element
 */
public class example16_FindFirst {
    /**
     * este metodo sirve para validar la primer conincidencia que encuentre y si cumple con el {@link Predicate} se termina la secuencua
     *
     * @param l
     * @param fdm
     * @param p
     * @return
     */
    private static Optional<Integer> firstElement(List<Integer> l, Function<Integer, Integer> fdm, Predicate<Integer> p) {
        return l.stream().map(fdm).filter(p).findFirst();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample16() {
        comentar(5, 16, "");
        Function<Integer, Integer> fdm = x -> x * x;
        Predicate<Integer> p = x -> x % 3 == 0;
        Optional<Integer> ff = firstElement(numbers, fdm, p);
    }

    public static void main(String[] args) {
        testExample16();
    }

}
