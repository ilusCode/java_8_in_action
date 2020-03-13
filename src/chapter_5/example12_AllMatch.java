package chapter_5;

import main.Genericos;
import main.data.DishData;
import main.model.DishModel;

import java.util.function.Predicate;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 129
 * 5.3.2. Checking to see if a predicate matches all elements
 */
public class example12_AllMatch {

    /**
     * este metodo se encarga de validar la senrencia {@link Predicate} si se cumpple retorna un valor true
     *
     * @param p
     * @return
     */
    private static boolean validator(Predicate<DishModel> p) {
        return Genericos.menu.stream().allMatch(p);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample12() {
        comentar(5, 12, "");
        DishData dd = new DishData();
        dd.loadData(Genericos.menu);
        Predicate<DishModel> p = d -> d.getCalories() < 1000;
        boolean isHealthy = validator(p);
        if (isHealthy) {
            System.out.println("Este menu es saludable");
        }
    }

    public static void main(String[] args) {
        testExample12();
    }
}
