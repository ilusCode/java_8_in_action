package chapter_3;

import main.interfaces.funcionales.Function;
import main.model.AppleModel;
import main.model.FruitModel;
import main.model.OrangeModel;

import java.util.HashMap;
import java.util.Map;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 88
 * The capability of referring to a constructor without instantiating it enables interesting applications.
 */
public class example21_Hashmap {
    /**
     * en este punto es lo primero que se ejecuta, y se crea la variable map
     */
    static Map<Integer, Function<String, FruitModel>> map = new HashMap<>();

    /**
     * en este apartado se asignan los datos, con la key y el modelo que se va a ejecutar cuando se coloque la key
     */
    static {
        map.put(1, AppleModel::new);
        map.put(2, OrangeModel::new);
    }

    /**
     * este metodo sirve para la asignacion de un valor de tipo {@link String} a un objeto al que se le pasa una key
     *
     * @param key
     * @param color
     * @return
     */
    public static FruitModel setterWithMap(Integer key, String color) {
        return map.get(key).apply(color);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     * se le hace referencia a un objeto {@link AppleModel} de un {@link FruitModel} para poder obtenr la informacion
     * que tiene el objeto que regresa el setterWithMap
     */
    private static void testExample21() {
        comentar("Capitulo 3","Ejemplo 21","");
        AppleModel f = (AppleModel) setterWithMap(1, "Gris");
        System.out.println(f.getColor());
    }

    public static void main(String[] args) {
        testExample21();
    }
}