package chapter_2;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.Comparator;
import java.util.List;

import static main.Genericos.*;

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
        comentar("Capitulo 2", "Example #14", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = createList();
        d.loadData(list);
        System.out.println("----------------------------- Normal -----------------------------");
        list.sort(new Comparator<AppleModel>() {
            @Override
            public int compare(AppleModel o1, AppleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        showListMod(list);
        System.out.println("----------------------------- Lambda -----------------------------");
        list.sort((AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight()));
        showListMod(list);
    }

    public static void main(String[] args) {
        testExample14();
    }
}
