package chapter_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 110
 * 4.3.1. Traversable only once
 */
public class example4_Traversable {
    /**
     * este metodo sirve para demostrar la funcionalidad de stream, ya que al ejecutar en dos ocaciones el stream,
     * truena deribado a la ejecucion por hilos, es decir, se quiere ejecutar la misma accion si terminarla anterior
     */
    private static void testExample4() {
        List<String> l = Arrays.asList("Java", "8", "in", "action");
        Stream<String> s = l.stream();
        s.forEach(System.out::println);
        //s.forEach(System.out::println);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void main(String[] args) {
        testExample4();
    }
}
