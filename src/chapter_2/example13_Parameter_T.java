package chapter_2;

import main.data.inventoryData;
import main.interfaces.predicate;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 51 - 52
 * 2.3.4. Seventh attempt: abstracting over List type
 */
public class example13_Parameter_T {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example13_Parameter_T() {
    }

    /**
     * Este metodo cumple la funcion de filtrar sin embargo lo puede realizar con cualquier tipo de objeto
     *
     * @param list
     * @param p
     * @param <T>  se refiere a un objeto generico
     * @return
     */
    public static <T> List<T> filter(List<T> list, predicate<T> p) {
        List<T> res = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                res.add(e);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample13() {
        inventoryData d = new inventoryData();
        List<appleModel> list = d.creaList();
        d.cargarDatos(list);
        System.out.println("-------------------------- RedApples --------------------------");
        List<appleModel> redApples = filter(list, (appleModel am) -> "Roja".equals(am.getColor()));
        d.mostrarList(redApples);
        System.out.println("-------------------------- Integer --------------------------");
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        List<Integer> evenNumber = filter(number, (Integer i) -> i % 2 == 0);
        for (Integer i : evenNumber) {
            System.out.println(i.toString());
        }
    }
}