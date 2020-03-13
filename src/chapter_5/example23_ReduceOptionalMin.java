package chapter_5;

import java.util.List;
import java.util.Optional;

import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 136
 * Quiz 5.3: Reducing
 */
public class example23_ReduceOptionalMin {

    /**
     * este metodo se encarga de simplificar la funcion de compareTo ya que muestra el valor minimo de una forma
     * sencill
     *
     * @param n
     * @return
     */
    public static Optional<Integer> reduceMin(List<Integer> n) {
        return n.stream().reduce(Integer::min);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample22() {
        Optional<Integer> max = reduceMin(numbers);
        System.out.println(max);
    }

    public static void main(String[] args) {
        testExample22();
    }
}
