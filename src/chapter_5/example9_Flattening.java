package chapter_5;

import java.util.Arrays;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 124
 * 5.2.2. Flattening streams
 */
public class example9_Flattening {
    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample9() {
        List<String> list = Arrays.asList("Hola", "Mundo");
//        List<String[]> l = list.stream().map(d -> d.split("")).distinct().collect(Collectors.toList());
        // list.stream().map();
        //System.out.println(c);
        String cadena = "Hola|Stackoverflow|en|español";
        String[] parts = cadena.split("|");
        System.out.println(Arrays.asList(parts));

    }

    public static void main(String[] args) {
        testExample9();
    }
}
