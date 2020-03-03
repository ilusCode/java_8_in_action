package chapter_2;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 38
 * 2.1.1. First attempt: filtering green apples
 */
public class example1_Filter {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example1_Filter() {
    }

    /**
     * Este metodo realiza un filtrado por medio del color verde
     *
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return una lista en donde se eñ bjeto en el campo color es verde
     */
    public static List<appleModel> filterApplesGreen(List<appleModel> list) {
        List<appleModel> res = new ArrayList();
        for (appleModel apple : list) {
            if ("Verde".equals(apple.getColor())) {
                res.add(apple);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample1() {
        comentar("Capitulo 2", "Example #1", "", "--------------------------------");
        inventoryData d=new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        List<appleModel> filterGreen = filterApplesGreen(list);
        d.mostrarList(filterGreen);
    }
}
