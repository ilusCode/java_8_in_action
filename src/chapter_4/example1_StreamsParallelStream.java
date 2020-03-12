package chapter_4;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 101
 * 4.1. What are streams?
 */
public class example1_StreamsParallelStream {
    /**
     * este metodo sirve para identificar cuales son los metodos que tienen bajas calorias
     *
     * @param menu
     * @param calories
     * @return
     */
    public static List<DishModel> lowCalories(List<DishModel> menu, boolean ban, int calories) {
        List<DishModel> list = createList();
        if (ban) {
            for (DishModel d : menu) {
                if (d.getCalories() > calories) {
                    list.add(d);
                }
            }
        } else {
            for (DishModel d : menu) {
                if (d.getCalories() < calories) {
                    list.add(d);
                }
            }
        }
        return list;
    }

    /**
     * este metodo sirve para la busqueda de los nombre los platillos de bajas calorias
     *
     * @param lowCaloricDishes
     * @return
     */
    public static List<String> searchName(List<DishModel> lowCaloricDishes) {
        List<String> lowCaloriesDishName = createList();
        for (DishModel d : lowCaloricDishes) {
            lowCaloriesDishName.add(d.getName());
        }
        return lowCaloriesDishName;
    }

    /**
     * este metodo realiza el filtrado por medio del atributo getCalories
     *
     * @param lowCaloricDishes
     * @return
     */
    private static List<String> useComparing(List<DishModel> lowCaloricDishes) {
        lowCaloricDishes.sort(comparing(DishModel::getCalories));
        return searchName(lowCaloricDishes);
    }

    /**
     * este metodo hace uso de lambdas por lo que el codigo se reduce, es decir, se realiza el comparing, mapeo
     * y filtrado en este sencillo codigo
     *
     * @param lowCaloricDishes
     * @return
     */
    private static List<String> useStream(List<DishModel> lowCaloricDishes) {
        return lowCaloricDishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(DishModel::getCalories))
                .map(DishModel::getName)
                .collect(toList());
    }

    private static List<String> useParallelalStream(List<DishModel> lowCaloricDishes) {
        return lowCaloricDishes
                .parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(DishModel::getCalories))
                .map(DishModel::getName)
                .collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample1() {
        comentar(4, 1, "");
        DishData dd = new DishData();
        dd.loadData(menu);
        List<DishModel> lowCaloricDishes = lowCalories(menu, false, 400);
        System.out.println("----------------------------");
        System.out.println("useComparing");
        showListGen(useComparing(lowCaloricDishes));
        System.out.println("----------------------------");
        System.out.println("useStream");
        showListGen(useStream(lowCaloricDishes));
        System.out.println("----------------------------");
        System.out.println("useParallelalStream");
        showListGen(useParallelalStream(lowCaloricDishes));
    }

    public static void main(String[] args) {
        testExample1();
    }
}