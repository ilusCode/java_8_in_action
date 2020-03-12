package chapter_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 120
 * Figure 5.2. Filtering unique elements in a stream
 */
public class example3_FilteringUnique {

    /**
     * este metodo sirve para obtener los datos que cumplen con el {@link java.util.function.Predicate<Integer>} en donde
     * no retorna datos repetitiovos
     *
     * @param list
     * @return
     */
    public static List<Integer> sa(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample3() {
        comentar(5, 3, "");
        List<Integer> li = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        List<Integer> l = sa(li);
        l.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testExample3();
    }
}
