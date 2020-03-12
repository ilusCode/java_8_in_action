package chapter_4;

import main.data.DishData;
import main.model.DishModel;

import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 111
 * Listing 4.1. Collections: external iteration with a for-each loop
 */
public class example5_Iteration {
    private static List<String> internalIteration(List<DishModel> menu) {
        return menu.stream().map(DishModel::getName).collect(toList());
    }

    private static List<String> iteratorBehind(List<DishModel> menu) {
        Iterator<DishModel> iterator = menu.iterator();
        List<String> d = createList();
        while (iterator.hasNext()) {
            DishModel dm = iterator.next();
            d.add(dm.getName());
        }
        return d;
    }

    private static List<String> iteratorForEach(List<DishModel> menu, List<String> names) {
        DishData d = new DishData();
        d.loadData(menu);
        for (DishModel dmodel : menu) {
            names.add(dmodel.getName());
        }
        return names;
    }

    private static void testExample5() {
        comentar(4, 5, "");
        List<String> names = createList();
        System.out.println("-------------------------------\n" + "iteratorForEach");
        showListGen(iteratorForEach(menu, names));
        System.out.println("-------------------------------\n" + "iteratorBehind");
        showListGen(iteratorBehind(menu));
        System.out.println("-------------------------------\n" + "internalIteration");
        showListGen(internalIteration(menu));
    }

    public static void main(String[] args) {
        testExample5();
    }
}
