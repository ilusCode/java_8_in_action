package chapter_1;

import main.model.AppleModel;

import java.util.List;

import static main.data.InventoryData.*;
import static java.util.stream.Collectors.toList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 32
 * 1.6. Forking filter onto two CPUs and joining the result
 */
public class example6_Streams2 {
    /**
     * este metodo se utiliza para la obtencion de concurrecnias de pocas ocaciones
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return regresa una lista con los objetos de tipo AppleModel
     */
    public static List<AppleModel> sequentialProcessing(List<AppleModel> list) {
        List<AppleModel> l = list.stream().filter((AppleModel am) -> am.getWeight() < 15).collect(toList());
        return l;
    }

    /**
     * este metodo se utiliza para la obtencion de concurrecnias de muchas consultas o de retorno de muchos valores
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return regresa una lista con los objetos de tipo AppleModel
     */
    public static List<AppleModel> parallelProcessing(List<AppleModel> list) {
        List<AppleModel> l=list.parallelStream().filter((AppleModel am)->am.getWeight()<15).collect(toList());
        return l;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample6() {
        System.out.println("Chapther 1");
        System.out.println("Example #6");
        List<AppleModel> list = creaList();
        cargarDatos(list);
        mostrarList(list);
        System.out.println("----------------------------- Sequential Processing -----------------------------");
        List<AppleModel> sp_heavyApple = sequentialProcessing(list);
        mostrarList(sp_heavyApple);
        System.out.println("----------------------------- Parallel Processing -----------------------------");
        List<AppleModel> pp_heavyApple = parallelProcessing(list);
        mostrarList(pp_heavyApple);
    }
}
