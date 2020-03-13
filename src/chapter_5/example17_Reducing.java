package chapter_5;

import java.util.Arrays;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.numbers;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 132
 * 5.4.1. Summing the elements
 */
public class example17_Reducing {

    /**
     * este metodo sirve para realizar una suma de los valores que se pasan por paramaetro
     *
     * @param n
     * @return
     */
    public static int addCount(List<Integer> n) {
        int sum = 0;
        for (int x : n) {
            sum += x;
        }
        return sum;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample17() {
        comentar(5, 17, "");
        addCount(numbers);
        System.out.println(addCount(numbers));
    }

    public static void main(String[] args) {
        testExample17();
    }
}

