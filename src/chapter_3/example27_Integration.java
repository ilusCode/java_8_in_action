package chapter_3;

import java.util.function.DoubleFunction;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 95
 * 3.9.2. Connecting to Java 8 lambdas
 */
public class example27_Integration {
    /**
     * este metodo utiliza el metodo predefiniido {@link DoubleFunction} con el que se se le aplica la
     * funcion f a las variables a y b
     *
     * @param f
     * @param a
     * @param b
     * @return
     */
    public static double integrateDoubleFunction(DoubleFunction<Double> f, Double a, Double b) {
        return (f.apply(a) + f.apply(b)) * (b - a) / 2;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample27() {
        DoubleFunction<Double> f = x -> x + 10.0;
        System.out.println(integrateDoubleFunction(f, 3.0, 7.0));
    }

    public static void main(String[] args) {
        testExample27();
    }
}
