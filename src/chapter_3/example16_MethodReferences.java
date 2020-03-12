package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 82
 * 3.6. Method references
 */
public class example16_MethodReferences {
    public static void main(String[] args) {
        testExample16();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample16() {
        comentar(3, 16, "");
        List<AppleModel> list = createList();
        InventoryData d = new InventoryData();
        d.loadData(list);
        list.sort(comparing(AppleModel::getWeight));
        showListMod(list);
        comentar(0, 0, "");
        /**
         * anonumusClass
         */
        list.sort(new Comparator<AppleModel>() {
            @Override
            public int compare(AppleModel o1, AppleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        showListMod(list);
    }
}
