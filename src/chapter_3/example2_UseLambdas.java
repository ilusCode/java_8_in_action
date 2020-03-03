package chapter_3;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 60
 * 3.2. Where and how to use lambdas
 */
public class example2_UseLambdas {

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2() {
        comentar("Capitulo 3", "Example #2", "", "--------------------------------");
        List<appleModel> list = creaList();
        inventoryData data = new inventoryData();
        data.cargarDatos(list);
        List<appleModel> lFilter = filter(list, (appleModel am) -> "Verde".equals(am.getColor()));
        data.mostrarList(lFilter);
    }
}
