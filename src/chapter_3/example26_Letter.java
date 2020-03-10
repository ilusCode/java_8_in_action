package chapter_3;


import java.util.function.Function;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 95
 * Figure 3.7. A transformation pipeline using andThen
 */
public class example26_Letter {
    /**
     * este metodo se encarga de mostrar un saludo fijo, ademas del mensaje que se le pasa como parametro
     *
     * @param s
     * @return
     */
    public static String addHeader(String s) {
        return "De Raul, Mario y Alan: " + s;
    }

    /**
     * este metodo se encarga de colocar una despedida al final de la cadena
     *
     * @param s
     * @return
     */
    public static String addFooter(String s) {
        return s + " Saludos";
    }

    /**
     * este metodo se encara de sustituir la palapra labda por lambda en el campo s
     *
     * @param s
     * @return
     */
    public static String checkSpeling(String s) {
        return s.replaceAll("labda", "lambda");
    }

    /**
     * en este emtodo se ejecutan los metodos addHeader,checkSpeling,addFooter
     *
     * @param addHeader
     * @return
     */
    private static Function<String, String> example2(Function<String, String> addHeader) {
        System.out.println("Example 2");
        return addHeader.andThen(example26_Letter::addFooter);
    }

    /**
     * en este emtodo se ejecutan los metodos addHeader,addFooter por lo que no se sustituye lo que se encutra en la variable s
     *
     * @param addHeader
     * @return
     */
    private static Function<String, String> example1(Function<String, String> addHeader) {
        System.out.println("Example 1");
        return addHeader.andThen(example26_Letter::checkSpeling).andThen(example26_Letter::addFooter);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample26() {
        Function<String, String> addHeader = example26_Letter::addHeader;
        System.out.println(example1(addHeader)
                .apply("labda labda labda labda labda"));
        System.out.println(example2(addHeader)
                .apply("labda labda labda labda labda"));
    }

    public static void main(String[] args) {
        testExample26();
    }
}
