package chapter_3;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 78
 * Diamond operator
 * Special void-compatibility rule
 * Quiz 3.5: Type checking–why won’t the following code compile?
 */
public class example13_DiamondOperator {

    /**
     * En este metodo se integran distintas formas de utilizar el comprateTo
     */
    public static void testExample13() {
        comentar(3, 13, "");
        problem();
        Runnable r = () -> {
            System.out.println("Tricky example");
        };
        r.run();
    }

    /**
     * en este metodo hace una impresion de lo que se quiere resolver
     */
    private static void problem() {
        System.out.println(
                "Object o = () -> { System.out.println(\"Tricky example\"); };"
        );
    }

    public static void main(String[] args) {
        testExample13();
    }
}
