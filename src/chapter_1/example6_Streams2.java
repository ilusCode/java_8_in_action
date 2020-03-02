package chapter_1;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.List;

import static java.util.stream.Collectors.toList;

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
     * @return regresa una lista con los objetos de tipo appleModel
     */
    public static List<appleModel> sequentialProcessing(List<appleModel> list) {
        return list.stream().filter((appleModel am) -> am.getWeight() < 15).collect(toList());
    }

    /**
     * este metodo se utiliza para la obtencion de concurrecnias de muchas consultas o de retorno de muchos valores
     *
     * @param list es una lista donde se encuentra los datos con los que se van a trabajar
     * @return regresa una lista con los objetos de tipo appleModel
     */
    public static List<appleModel> parallelProcessing(List<appleModel> list) {
        return list.parallelStream().filter((appleModel am) -> am.getWeight() < 15).collect(toList());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample6() {
        System.out.println("Chapther 1");
        System.out.println("Example #6");
        inventoryData d = new inventoryData();
        List<appleModel> list = d.creaList();
        d.cargarDatos(list);
        d.mostrarList(list);
        System.out.println("----------------------------- Sequential Processing -----------------------------");
        List<appleModel> sp_heavyApple = sequentialProcessing(list);
        d.mostrarList(sp_heavyApple);
        System.out.println("----------------------------- Parallel Processing -----------------------------");
        List<appleModel> pp_heavyApple = parallelProcessing(list);
        d.mostrarList(pp_heavyApple);
    }
}
