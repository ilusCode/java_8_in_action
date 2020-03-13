package chapter_5;

import java.util.Optional;
import java.util.function.BinaryOperator;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 134
 * No initial value
 */
public class example21_ReduceOptionalNoInitalValue {
    /**
     * este metodo valida que el valor de retorno sea jeno a null
     *
     * @param bi
     * @return
     */
    private static Optional<Integer> reduceOptional(BinaryOperator<Integer> bi) {
        return numbers.stream().reduce(bi);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample21() {
        comentar(5, 21, "");
        BinaryOperator<Integer> bi = (a, b) -> a + b;
        System.out.println(reduceOptional(bi));
    }

    public static void main(String[] args) {
        testExample21();
    }
}
