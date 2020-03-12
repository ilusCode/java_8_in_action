package chapter_4;

import main.model.DishModel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static main.Genericos.comentar;
import static main.Genericos.menu;
import static main.model.DishModel.Type.MEAT;
import static main.model.DishModel.Type.OTHER;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 102
 * Figure 4.1. Chaining stream operations forming a stream pipeline
 */
public class example2_Chaining {

    /**
     * este metodo sirve para imprimir lo que tenga un map
     *
     * @param dishesType
     * @param t
     */
    private static void showMap(Map<DishModel.Type, List<DishModel>> dishesType, DishModel.Type t) {
        for (Map.Entry<DishModel.Type, List<DishModel>> d : dishesType.entrySet()) {
            List<DishModel> dm = d.getValue();
            for (DishModel dish : dm) {
                if (dish.getType().equals(t)) {
                    System.out.println(dish.getName());
                }
            }
        }
    }

    /**
     * este metodo sirve para realizar la carga de los datos desde un {@link Arrays}
     *
     * @return
     */
    private static List<DishModel> loadData() {
        return Arrays.asList(
                new DishModel(800, false, "pork", DishModel.Type.MEAT),
                new DishModel(700, false, "beef", DishModel.Type.MEAT),
                new DishModel(400, false, "chicken", DishModel.Type.MEAT),
                new DishModel(530, true, "french fries", OTHER),
                new DishModel(350, true, "rice", OTHER),
                new DishModel(120, true, "season fruit", OTHER),
                new DishModel(550, true, "pizza", OTHER),
                new DishModel(300, false, "prawns", DishModel.Type.FISH),
                new DishModel(450, false, "salmon", DishModel.Type.FISH));
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample2() {
        comentar(4, 2, "");
        menu = loadData();
        Map<DishModel.Type, List<DishModel>> dishesType = menu.stream().collect(groupingBy(DishModel::getType));
        showMap(dishesType, MEAT);
    }

    public static void main(String[] args) {
        testExample2();
    }
}
