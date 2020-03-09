package chapter_2;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

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
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample13() {
        comentar("Capitulo 2", "Example #13", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = creaList();
        d.loadData(list);
        System.out.println("-------------------------- RedApples --------------------------");
        List<AppleModel> redApples = filterMod(list, (AppleModel am) -> "Roja".equals(am.getColor()));
        showListMod(redApples);
        System.out.println("-------------------------- Integer --------------------------");
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        List<Integer> evenNumber = filterMod(number, (Integer i) -> i % 2 == 0);
        for (Integer i : evenNumber) {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {
        testExample13();
    }
}