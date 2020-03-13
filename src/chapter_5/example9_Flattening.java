package chapter_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 126
 * Using flatMap
 */
public class example9_Flattening {
    /**
     * este metodo se encarga de extraer los caracteres no repetitivos de el arreglo de string que recibe
     *
     * @param list
     * @return
     */
    private static List<String> extractCharacters(List<String> list) {
        return list.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample9() {
        List<String> list = Arrays.asList("sasaassad", "NKEWWEsa");
        extractCharacters(list);
        extractCharacters(list).forEach(System.out::println);
    }

    public static void main(String[] args) {
        testExample9();
    }
}
