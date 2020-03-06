package chapter_3;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 80
 * 3.5.4. Using local variables
 */
public class example15_VariablesLocales {
    public static void main(String[] args) {
        testExample15();
    }

    /**
     * En este metodo se integran distintas formas de utilizar el comprateTo
     * En este metodo se realiza un ejemplo ERRONEO de la declaracion de variables en una lambda,
     * derivado a que se esta reasignando una variable, es decir, la variable port por se declara
     * con un valor incial de 1337 hasta la implementacion de la lambda funciona bien, el problema
     * surge cuando se reasigna la variable port. Para dar solucion a esto, debe generar una fueva
     * variable haciendo referencia a port.
     */
    public static void testExample15() {
        comentar("Capitulo 3", "Ejemplo 15", "");
        /**
         * PROBLEMA
         * int port = 1337;
         * Runnable r = () -> System.out.println(p);
         * port = 31337;
         */

        int port = 1337;
        solucion(port);
    }

    /**
     * este metodo recibe el parametro port con valor de 1337, pero como se realiza la asginacion a una
     * nueva variable de tipo int p, si se le puede asignar otro valor.
     *
     * @param port
     */
    private static void solucion(int port) {
        int p = port;
        Runnable r = () -> System.out.println(p);
        port = 31337;
    }
}
