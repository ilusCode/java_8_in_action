package chapter_3;

import static main.Genericos.comentar;
import static main.Genericos.process;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 63
 */
public class example3_MethodRunnable {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example3_MethodRunnable() {
    }

    /**
     * Este metodo hace uso de lambdas con hilos
     *
     * @return regresa el resultado obtenido del metodo
     */
    public static Runnable useLambda() {
        return () -> System.out.println("uso de Lambdas");
    }

    /**
     * Este metodo hace uso de una clase anonima en conjunto de hilos
     *
     * @return regresa el resultado obtenido del metodo
     */
    public static Runnable anonumusClass() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymusClass");
            }
        };
    }

    public static void testExample3() {
        comentar("Capilulo 3", "Example #3", "Distinta implementacion de hilos", "--------------------------------");
        Runnable r1 = useLambda();
        Runnable r2 = anonumusClass();
        process(r1);
        process(r2);
        process(() -> System.out.println("lambda directo"));
    }
}
