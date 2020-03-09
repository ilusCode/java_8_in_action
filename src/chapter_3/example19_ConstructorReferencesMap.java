package chapter_3;

import main.interfaces.funcionales.Function;
import main.model.AppleModel;

import java.util.Arrays;
import java.util.List;

import static main.Genericos.creaList;

public class exmaple19_ConstructorReferencesMap {

    /**
     * este metodo no se le especifica a que variable se le va asignar lo que regrese del map,
     * por lo que el primer constrcutor que encuentre con el tipo de dato es al que se le asigna
     *
     * @param list
     * @return
     */
    public static List<AppleModel> sinAsignacion(List<Integer> list) {
        return map(list, AppleModel::new);
    }

    /**
     * este metodo se se le especifica a que variable se le va asignar lo que regrese del map
     *
     * @param list
     * @return
     */
    public static List<AppleModel> asignacionParametrizado(List<Integer> list) {
        return map(list, (weight) -> new AppleModel(weight));
    }

    /**
     * este metodo sirve para recorrer un arreglo con el que se valida si se cumple una sentecia, ademas, de transformar
     * de un campo {@link Integer} a un {@link AppleModel}
     *
     * @param li es una lista donde se encuentra la informacion que se va a recorrer
     * @param f  sentencia con la que se valida si es agregada a la lista del return
     * @return
     */
    public static List<AppleModel> map(List<Integer> li, Function<Integer, AppleModel> f) {
        List<AppleModel> res = creaList();
        for (Integer i : li) {
            res.add(f.apply(i));
        }
        return res;
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    private static void testExample19() {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 9);

        for (AppleModel a : sinAsignacion(listInt)) {
            System.out.println(a.getWeight());
        }

        for (AppleModel a : asignacionParametrizado(listInt)) {
            System.out.println(a.getWeight());
        }
    }

    public static void main(String[] args) {
        testExample19();
    }
}
