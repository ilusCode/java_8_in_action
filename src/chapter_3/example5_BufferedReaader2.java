package chapter_3;

import java.io.BufferedReader;
import java.io.IOException;

import static main.Genericos.comentar;
import static main.Genericos.processFile;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 68
 * 3.3.4. Step 4: Pass lambdas
 */
public class example5_BufferedReaader2 {

    /**
     * este metodo se tiene una forma de utilizar lambdas a una linea
     *
     * @return
     * @throws IOException
     */
    public static String oneLine() throws IOException {
        return processFile((BufferedReader br) -> br.readLine());
    }

    /**
     * este metodo se tiene una forma de utilizar lambdas a dos linea
     *
     * @return
     * @throws IOException
     */
    public static String twoLine() throws IOException {
        return processFile((BufferedReader br) -> br.readLine() + br.readLine());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample5() throws IOException {
        comentar(6, 5, "");
        System.out.println(oneLine());
        System.out.println(twoLine());
    }

    public static void main(String[] args) throws IOException {
        testExample5();
    }
}
