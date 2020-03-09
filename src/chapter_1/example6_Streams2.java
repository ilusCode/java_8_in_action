package chapter_1;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 32
 * 1.6. Forking filter onto two CPUs and joining the result
 */
public class example6_Streams2 {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example6_Streams2() {
    }

    /**
     * este metodo se utiliza para la obtencion de concurrecnias de pocas ocaciones
     *
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return regresa una lista con los objetos de tipo AppleModel
     */
    public static List<AppleModel> sequentialProcessing(List<AppleModel> list) {
        return list.stream().filter((AppleModel am) -> am.getWeight() < 15).collect(toList());
    }

    /**
     * este metodo se utiliza para la obtencion de concurrecnias de muchas consultas o de retorno de muchos valores
     *
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return regresa una lista con los objetos de tipo AppleModel
     */
    public static List<AppleModel> parallelProcessing(List<AppleModel> list) {
        return list.parallelStream().filter((AppleModel am) -> am.getWeight() < 15).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample6() {
        comentar("Capitulo 1", "Example #6", "");
        InventoryData d = new InventoryData();
        List<AppleModel> list = creaList();
        d.loadData(list);
        showListMod(list);
        System.out.println("----------------------------- Sequential Processing -----------------------------");
        List<AppleModel> sp_heavyApple = sequentialProcessing(list);
        showListMod(sp_heavyApple);
        System.out.println("----------------------------- Parallel Processing -----------------------------");
        List<AppleModel> pp_heavyApple = parallelProcessing(list);
        showListMod(pp_heavyApple);
    }

    public static void main(String[] args) {
        testExample6();
    }
}
