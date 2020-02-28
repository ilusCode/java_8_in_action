package chapter_1.data;

import chapter_1.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

public class InventoryData {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private InventoryData() {
    }

    /**
     * este metodo sirve para la creacion de la lista con un modelo AppleModel
     * @return regresa una lista con el tipo de modelo asignado
     */
    public static List<AppleModel> creaList() {
        List<AppleModel> list = new ArrayList<AppleModel>();
        return list;
    }

    ;

    /**
     * este metodo sirve para la asignacion de valores al objeto de la lista
     * @param list
     * @param weight
     * @param color
     * @param pieces
     * @return regresa una lista llena con los objetos que se les paso como parametros
     */
    public static boolean llenarList(List<AppleModel> list, int weight, String color, int pieces) {
        AppleModel a = new AppleModel();
        a.setWeight(weight);
        a.setColor(color);
        a.setPiece(pieces);
        return list.add(a);
    }

    /**
     * este metodo sirve para el llenado de una lista de forma manual
     * @param list es la lista a llenar con el modelo de AppleModel
     */
    public static void cargarDatos(List<AppleModel> list) {
        llenarList(list, 21, "Azul", 12);
        llenarList(list, 23, "Amarilla", 12);
        llenarList(list, 43, "Roja", 3);
        llenarList(list, 12, "Verde", 21);
        llenarList(list, 53, "Verde", 133);
    }

    /**
     * este metodo sirve para realizar una impresion de una lista
     * @param list
     */
    public static void mostrarList(List<AppleModel> list) {
        for (AppleModel x : list) {
            System.out.println(x.getWeight() + " - " + x.getColor() + " - " + x.getPiece());
        }
    }

}
