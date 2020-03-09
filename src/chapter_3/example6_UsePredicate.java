package chapter_3;

import main.interfaces.funcionales.Predicate;

import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 70
 * Listing 3.2. Working with a Predicate
 */
public class example6_UsePredicate {

    /**
     * Este metodo cumple con la sentencia especificada en el predicate
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample6() {
        comentar("Capitulo 3", "Ejemplo #6", "");
        List<String> list = creaList();
        list.add("cadena #1");
        list.add("cadena #2");
        list.add("cadena #3");
        list.add("cadena #4");
        list.add("cadena #5");
        Predicate<String> validIsEmpty = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filterMod(list, validIsEmpty);
        showListGen(nonEmpty);
    }
    public static void main(String[] args) {
        testExample6();
    }
}
