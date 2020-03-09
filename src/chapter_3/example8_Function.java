package chapter_3;

import main.interfaces.funcionales.Function;

import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 72
 * Listing 3.4. Working with a Function
 */
public class example8_Function {

    /**
     * este metodo obtiene los tamaños de cada campo del arreglo
     *
     * @param list
     * @return regresa una lista con los tamaños de cada palabra
     */
    public static List<Integer> sinSentencia(List<String> list) {
        return apply(list, (String s) -> s.length());
    }

    /**
     * Este metodo realiza la misma funcion que el medoto sinSentencia() de recorrer y obtener los tamañas de las palabras
     * la unica diferencia es que en este metodo utiliza una optimizacion de codigo
     *
     * @param list
     * @return
     */
    public static List<Integer> sinSentenciaLambda(List<String> list) {
        return apply(list, (String::length));
    }

    /**
     * Este metodo hace uso de lambdas para cumplir con la sentecia especificada
     *
     * @param list
     * @return
     */
    public static List<Integer> useLambda(List<String> list) {
        return apply(list, (String s) -> {
            if (s.length() > 3) {
                return s.length();
            } else {
                return 0;
            }
        });
    }

    /**
     * Este metodo hace uso de una clase anonima
     *
     * @param list
     * @return regresa un listado con los valores mayores a 3
     */
    public static List<Integer> anonymusClass(List<String> list) {
        return apply(list, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                if (s.length() > 3) {
                    return s.length();
                } else {
                    return 0;
                }
            }
        });
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample8() {
        List<String> list = creaList();
        list.add("Java");
        list.add("8");
        list.add("in");
        list.add("Action");
        showListGen(anonymusClass(list));
        comentar("", "", "");
        showListGen(sinSentencia(list));
        comentar("", "", "");
        showListGen(sinSentenciaLambda(list));
        comentar("", "", "");
        showListGen(useLambda(list));
    }

    public static void main(String[] args) {
        testExample8();
    }

}