package chapter_3;


import java.util.function.Function;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 93
 * 3.8.3. Composing Functions
 */
public class example25_ComposingFunctions {
    /**
     * este metodo sirve para unir dos valores de tipo {@link Function<Integer,Integer>} en donde se ejecuta primero uno
     * y enseguida el otro con parametros en comun
     * Ejecucion primero f y despues g
     *
     * @param f
     * @param g
     * @return
     */
    public static Function<Integer, Integer> andThen(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return f.andThen(g);
    }

    /**
     * este metodo sirve para unir dos valores de tipo {@link Function<Integer,Integer>} en donde se ejecuta primero uno
     * y enseguida el otro con parametros en comun
     * Ejecucion primero g y despues f
     *
     * @param f
     * @param g
     * @return
     */
    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return f.compose(g);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample25() {
        comentar("Capitulo 3", "Ejemplo 25", "");
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        int resAndThen = andThen(f, g).apply(10);
        int resCompose = compose(f, g).apply(10);
        System.out.println("El resultado de AndThen es: " + resAndThen);
        System.out.println("El resultado de Compose es: " + resCompose);
    }

    public static void main(String[] args) {
        testExample25();
    }

}
