package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 60
 * 3.2. Where and how to use lambdas
 */
public class example2_UseLambdas {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example2_UseLambdas() {
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2() {
        comentar("Capitulo 3", "Example #2", "");
        List<AppleModel> list = creaList();
        InventoryData d = new InventoryData();
        d.cargarDatos(list);
        List<AppleModel> lFilter = filter(list, (AppleModel am) -> "Verde".equals(am.getColor()));
        d.mostrarList(lFilter);
    }
    public static void main(String[] args) {
        testExample2();
    }
}
