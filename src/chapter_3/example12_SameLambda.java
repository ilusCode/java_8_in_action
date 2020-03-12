package chapter_3;

import main.interfaces.Comparator;
import main.model.AppleModel;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 77
 * 3.5.2. Same lambda, different functional interfaces
 */
public class example12_SameLambda {
    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private example12_SameLambda() {

    }

    /**
     * En este metodo se integran distintas formas de utilizar el comprateTo
     */
    public static void testExample12() {
        comentar(3, 12, "");
        Callable<Integer> c = () -> 42;
        PrivilegedAction<Integer> p = () -> 42;
        Comparator<AppleModel> com1 = (AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
        ToIntBiFunction<AppleModel, AppleModel> com2 = (AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
        BiFunction<AppleModel, AppleModel, Integer> com3 = (AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    public static void main(String[] args) {
        testExample12();
    }
}
