package chapter_5;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 134
 * Figure 5.7. Using reduce to sum the numbers in a stream
 */
public class example20_ReduceLambda {
    /**
     * @return
     */
    private static int reduceLambda() {
        return numbers.stream().reduce(0, Integer::sum);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample20() {
        comentar(5, 20, "");
        System.out.println(reduceLambda());
    }

    public static void main(String[] args) {
        testExample20();
    }
}
