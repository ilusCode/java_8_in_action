package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 82
 * 3.6. Method references
 */
public class example16_MethodReferences {
    public static void main(String[] args) {
        testExample16();
    }

    public static void testExample16() {
        comentar("Capitulo 3", "Ejemplo 16", "");
        List<AppleModel> list = creaList();
        InventoryData d = new InventoryData();
        d.cargarDatos(list);
        list.sort(comparing(AppleModel::getWeight));
        d.mostrarList(list);
        comentar("", "", "");
        /**
         * anonumusClass
         */
        list.sort(new Comparator<AppleModel>() {
            @Override
            public int compare(AppleModel o1, AppleModel o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        d.mostrarList(list);
    }
}
