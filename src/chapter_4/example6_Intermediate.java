package chapter_4;

import main.Genericos;
import main.data.DishData;
import main.model.DishModel;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 114
 * 4.4.1. Intermediate operations
 */
public class example6_Intermediate {

    /**
     * este metodo muestra el ciclo de vida que lleva una iteracion interna por lo que se realiza a la par, es decir,
     * se evalua el primer valor de la lista en filter y si es valido en el filter entonces continua en el map, sino
     * se salta y continua con el siguiente
     *
     * @param menu
     * @return
     */
    public static List<String> intermediate(List<DishModel> menu) {
        return menu
                .stream()
                .filter(d -> {
                    System.out.println("Filter: " + d.getName());
                    return d.getCalories() > 150;
                })
                .map(d -> {
                    System.out.println("Mapping: " + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample6() {
        DishData dd = new DishData();
        dd.loadData(Genericos.menu);
        intermediate(Genericos.menu);
    }

    public static void main(String[] args) {
        testExample6();
    }
}
