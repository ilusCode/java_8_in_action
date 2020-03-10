package chapter_2;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 39
 * 2.1.2. Second attempt: parameterizing the color
 */
public class example3_FilterByWeight {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example3_FilterByWeight() {
    }

    public static List<AppleModel> filterApplesByWeight(List<AppleModel> list, int weight) {
        List<AppleModel> res = new ArrayList<>();
        for (AppleModel am : list) {
            if (am.getWeight() > weight) {
                res.add(am);
            }
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample3() {
        comentar("Capitulo 2", "Example #3", "");
        InventoryData d=new InventoryData();
        List<AppleModel> list = createList();
        d.loadData(list);
        List<AppleModel> weightApples = filterApplesByWeight(list, 10);
        showListMod(weightApples);
    }

    public static void main(String[] args) {
        testExample3();
    }
}
