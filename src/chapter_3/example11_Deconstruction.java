package chapter_3;

import main.data.InventoryData;

import java.util.function.Predicate;

import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 77
 * Figure 3.4. Deconstructing the type-checking process of a lambda expression
 */
public class example11_Deconstruction {
    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private example11_Deconstruction() {

    }

    /**
     * este metodo hace uso de un predicate para validar la sentencia
     *
     * @param list
     * @param p
     * @return
     */
    public static List<AppleModel> usePredicate(List<AppleModel> list, Predicate<AppleModel> p) {
        List<AppleModel> r = createList();
        for (AppleModel l : list) {
            if (p.test(l)) {
                r.add(l);
            }
        }
        return r;
    }

    /**
     * @param list
     * @return
     */
    public static List<AppleModel> useLambda(List<AppleModel> list) {
        return filterMod(list, (AppleModel a) -> a.getWeight() > 15);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample11() {
        comentar(3, 11, "");
        List<AppleModel> list = new ArrayList<>();
        Predicate<AppleModel> p = appleModel -> appleModel.getWeight() > 15;
        InventoryData d = new InventoryData();
        d.loadData(list);
        showListMod(useLambda(list));
        comentar(0, 0, "");
        showListMod(usePredicate(list, p));
        comentar(0, 0, "");
        showListMod(filterMod(list, new Predicate<AppleModel>() {
                    @Override
                    public boolean test(AppleModel appleModel) {
                        return appleModel.getWeight() > 10;
                    }
                })
        );
    }

    public static void main(String[] args) {
        testExample11();
    }
}
