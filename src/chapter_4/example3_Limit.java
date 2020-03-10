package chapter_4;

import main.data.DishData;
import main.model.DishModel;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static main.Genericos.menu;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 106
 * 4.2. Getting started with streams
 */
public class example3_Limit {
    /**
     * este metdo realiza la consulta de los datos, los filta bajo la sentencia de el max de calorias y muestra los primero 3
     *
     * @param menu  es una ista con la informacion que a tratar
     * @param limit este valor limita al numeo de valores a mostrar
     * @param p     este parametro sirve para verificar la sentencia de filtrado
     * @return
     */
    private static List<String> limit(List<DishModel> menu, int limit, Predicate<DishModel> p) {
        return menu.stream().filter(p).map(DishModel::getName).limit(limit).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample3() {
        DishData dd = new DishData();
        dd.loadData(menu);
        Predicate<DishModel> p = d -> d.getCalories() > 100;
        System.out.println(limit(menu, 3, p));
    }

    public static void main(String[] args) {
        testExample3();
    }
}
