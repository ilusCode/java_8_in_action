package chapter_3;

import main.interfaces.funcionales.BufferedReaderProcessor;
import main.interfaces.funcionales.Function;

import java.io.BufferedReader;
import java.io.IOException;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 75
 * What about exceptions, lambdas, and functional interfaces?
 */
public class example10_ExceptionsLambdasFunctionalInterface {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example10_ExceptionsLambdasFunctionalInterface() {
    }

    /**
     * este metodo hace uso de una clase anonima en donde se tiene una variable tipo {@link BufferedReader} y la convierte en {@link String}
     *
     * @return regresa una cadena de texto
     */
    public static Function<BufferedReader, String> anonymusClass() {
        Function<BufferedReader, String> fbr = new Function<BufferedReader, String>() {
            @Override
            public String apply(BufferedReader bufferedReader) {
                try {
                    return bufferedReader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        };
        return fbr;
    }
    private static String apply(BufferedReader b) {
        try {
            return b.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    /**
     * este metodo realiza una convercion de un {@link BufferedReader} a un {@link String}
     * reutilizando el metodo apply() extraido la clase {@link example10_ExceptionsLambdasFunctionalInterface}
     * @return
     */
    public static Function<BufferedReader, String> useLambdas() {
        return example10_ExceptionsLambdasFunctionalInterface::apply;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample10() {
        comentar("Capitulo 3", "Ejemplo 10", "");
        BufferedReaderProcessor brP = (BufferedReader br) -> br.readLine();
        System.out.println(anonymusClass());
        System.out.println(useLambdas());
    }

    public static void main(String[] args) {
        testExample10();
    }
}
