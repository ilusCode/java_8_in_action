package chapter_3;

import main.interfaces.funcionales.BiFunction;
import main.model.AppleModel;

import java.util.List;

import static main.Genericos.comentar;
import static main.Genericos.creaList;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 87
 * 3.6.2. Constructor references
 */
public class example20_BiFunction {

    /**
     * este metodo se le especifica a que variable se le va asignar en el objeto {@link AppleModel}
     *
     * @param w
     * @param c
     * @return
     */
    private static AppleModel asignacionParametrizado(int w, String c) {
        BiFunction<Integer, String, AppleModel> bi = (weigh, color) -> new AppleModel(weigh, color);
        return bi.apply(w, c);
    }

    /**
     * este metodo no se le especifica a que variable se le va asignar  en el objeto {@link AppleModel}
     * por lo que el primer constrcutor que encuentre con el tipo de dato es al que se le asigna
     *
     * @param w
     * @param c
     * @return
     */
    private static AppleModel sinAsignacion(int w, String c) {
        BiFunction<Integer, String, AppleModel> bi = AppleModel::new;
        return bi.apply(w, c);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample20() {
        comentar("Capitulo 3", "Ejemplo 20", "");
        List<AppleModel> lsp = creaList();
        lsp.add(sinAsignacion(1, "plata"));
        lsp.add(sinAsignacion(6, "Oro"));
        lsp.add(sinAsignacion(176, "Verde"));
        for (AppleModel a : lsp) {
            System.out.println(a.getWeight() + " - " + a.getColor());
        }
        comentar("", "", "");
        List<AppleModel> lap = creaList();
        lap.add(asignacionParametrizado(12, "Rosa"));
        lap.add(asignacionParametrizado(1212, "Amarillo"));
        lap.add(asignacionParametrizado(13243, "Cafe"));
        lap.add(asignacionParametrizado(134, "Gris"));
        for (AppleModel a : lap) {
            System.out.println(a.getWeight() + " - " + a.getColor());
        }
    }

    public static void main(String[] args) {
        testExample20();
    }
}
