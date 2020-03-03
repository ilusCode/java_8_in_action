package chapter_2;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.Comparator;
import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 53
 * 2.4.1. Sorting with a Comparator
 */
public class example14_Comparator {
    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example14_Comparator() {
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample14() {
        comentar("Capitulo 2", "Example #14", "", "--------------------------------");
        inventoryData d = new inventoryData();
        List<appleModel> list = creaList();
        d.cargarDatos(list);
        System.out.println("----------------------------- Normal -----------------------------");
        list.sort(new Comparator<appleModel>() {
            @Override
            public int compare(appleModel o1, appleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        d.mostrarList(list);
        System.out.println("----------------------------- Lambda -----------------------------");
        list.sort((appleModel a1, appleModel a2) -> a1.getWeight().compareTo(a2.getWeight()));
        d.mostrarList(list);
    }
}
