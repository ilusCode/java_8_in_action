package chapter_5;

import main.Genericos;
import main.data.DishData;
import main.model.DishModel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 129
 * 5.3.1. Checking to see if a predicate matches at least one element
 */
public class example11_TwoIteration {

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     * este metodo sirve para validar una sentencia de resultado booleano
     */
    private static void testExample11() {
        comentar(5, 11, "");
        DishData dd = new DishData();
        dd.loadData(Genericos.menu);
        if (Genericos.menu.stream().anyMatch(DishModel::isVegetarian)) {
            System.out.println("El menú es (algo) vegetariano");
        }
    }

    public static void main(String[] args) {
        testExample11();
    }
}
