package chapter_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 67
 * Figure 3.2. Tasks A and B are surrounded by the same redundant code responsible for preparation/cleanup.
 */
public class example4_BufferedReaader {

    /**
     * Este metodo realiza la funcion de recorrer un archivo de forma parametrizada
     *
     * @return
     * @throws IOException
     */
    public static String noparameterization() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    /**
     * Este metodo realiza la funcion de recorrer un archivo de forma parametrizada
     *
     * @param br
     * @return
     * @throws IOException
     */
    public static String parameterization(BufferedReader br) throws IOException {
        return br.readLine();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample4() throws IOException {
        comentar("Capilulo 3", "Example #4", "Distinta implementacion de hilos", "--------------------------------");
        noparameterization();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            parameterization(br);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}