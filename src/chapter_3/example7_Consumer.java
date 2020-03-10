package chapter_3;

import main.interfaces.funcionales.Consumer;

import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 71
 * Listing 3.3. Working with a Consumer
 */
public class example7_Consumer {
    /**
     * Este metodo valida que los campos que se encuentran en la lista cumplan con la sentencia
     *
     * @param list
     * @return
     */
    public static Consumer<Integer> useLambda(List<Integer> list) {
        return integer -> {
            if (integer < 3) {
                System.out.println(integer);
            }
        };
    }

    /**
     * Este metodo solo realiza un recorrido general la lista
     *
     * @param l
     */
    public static void mostrarDirectamentes(List<Integer> l) {
        accept(l, (Integer i) -> System.out.println(i));
    }

    /**
     * Este metodo evita la generacion de una variable tipo Consumer
     *
     * @param list
     */
    public static void implementacionDirecta(List<Integer> list) {
        accept(list, (Integer i) -> {
            if (i < 3) {
                System.out.println(i);
            }
        });
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample7() {
        comentar("Capitulo 3", "Ejemplo 7", "");
        List<Integer> l = createList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        accept(l, useLambda(l));
        comentar("", "", "");
        implementacionDirecta(l);
        comentar("", "", "");
        mostrarDirectamentes(l);
    }
    public static void main(String[] args) {
        testExample7();
    }
}
