package chapter_3;

import main.interfaces.funcionales.TriFunction;
import main.model.AppleModel;
import main.model.FruitModel;
import main.model.OrangeModel;

import java.util.HashMap;
import java.util.Map;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 88
 * Quiz 3.7: Constructor references
 */
public class example22_Trifunction {

    /**
     * en este punto es lo primero que se ejecuta, y se crea la variable map, con 3 campos
     * {@link Integer,String,Integer}
     */
    static Map<Integer, TriFunction<Integer, String, Integer, FruitModel>> m = new HashMap<>();

    /**
     * en este apartado se asignan los datos, con la key y el modelo que se va a ejecutar cuando se coloque la key
     */
    static {
        m.put(1, AppleModel::new);
        m.put(2, OrangeModel::new);
    }

    /**
     * este metodo sirve para la asignacion los valores de un objeto al que se le pasa una key
     *
     * @param key
     * @param weight
     * @param color
     * @param pieces
     * @return
     */
    public static FruitModel setterWithMap(Integer key, Integer weight, String color, Integer pieces) {
        return m.get(key).apply(weight, color, pieces);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample22() {
        comentar("Capitulo 3", "Ejemplo 22", "");
        AppleModel a = (AppleModel) setterWithMap(1, 21, "Negro", 14);
        System.out.println(a.getWeight() + " - " + a.getColor() + " - " + a.getPiece());
    }

    public static void main(String[] args) {
        testExample22();
    }
}
