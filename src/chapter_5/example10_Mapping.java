package chapter_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static main.Genericos.comentar;
import static main.Genericos.createList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 126
 * Quiz 5.2: Mapping
 */
public class example10_Mapping {

    /**
     * este metodo sirve para extraer los multiplos de un arreglo
     *
     * @param list
     * @return
     */
    private static List<Integer> exponent(List<Integer> list) {
        return list.stream().map(n -> n * n).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample10() {
        comentar(5, 10, "");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        exponent(list).forEach(System.out::println);
    }

    public static void main(String[] args) {
        testExample10();
    }
}
