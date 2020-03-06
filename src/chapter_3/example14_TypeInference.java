package chapter_3;

import main.data.InventoryData;
import main.model.AppleModel;

import java.util.Comparator;
import java.util.List;

import static main.Genericos.*;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 80
 * 3.5.3. Type inference
 */
public class example14_TypeInference {

    /**
     * en este metodose especifican el tipo de inferencia, es decir, el tipo de dato
     *
     * @return
     */
    private static Comparator<AppleModel> withoutInference() {
        return (AppleModel a1, AppleModel a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    /**
     * este metodo no se especifica el tipo de dato que va a ingresar al compareTo, sin embagrgo, toman el tipo de dato que se le especifique en el {@link Comparator<AppleModel>}
     *
     * @return
     */
    private static Comparator<AppleModel> withInference() {
        return (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    /**
     * en este metodo no se especifica el tipo de dato porque toma el de la {@link List<AppleModel>}
     *
     * @param list
     * @return
     */
    private static List<AppleModel> omittedParameter(List<AppleModel> list) {
        return filter(list, a -> "Verde".equals(a.getColor()));
    }

    /**
     * En este metodo se integran distintas formas de utilizar el comprateTo
     */
    private static void testExample14() {
        comentar("Capitulo 3", "Ejemplo 14", "");
        List<AppleModel> list = creaList();
        InventoryData d = new InventoryData();
        d.cargarDatos(list);
        d.mostrarList(omittedParameter(list));
        Comparator<AppleModel> sin = withoutInference();
        Comparator<AppleModel> con = withInference();
    }

    public static void main(String[] args) {
        testExample14();
    }
}
