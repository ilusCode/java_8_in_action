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

    public static List<AppleModel> creaList() {
        List<AppleModel> inventory = new ArrayList<AppleModel>();
        return inventory;
    }

    ;

    public static boolean llenarList(List<AppleModel> i, int weight, String color, int pieces) {
        AppleModel a = new AppleModel();
        a.setWeight(weight);
        a.setColor(color);
        a.setPiece(pieces);
        return i.add(a);
    }

    public static void cargarDatos(List<AppleModel> x) {
        llenarList(x, 21, "Azul", 12);
        llenarList(x, 23, "Amarilla", 12);
        llenarList(x, 43, "Roja", 3);
        llenarList(x, 12, "Verde", 21);
        llenarList(x, 53, "Verde", 133);
    }

    public static void mostrarList(List<AppleModel> i) {
        for (AppleModel x : i) {
            System.out.println(x.getWeight() + " - " + x.getColor() + " - " + x.getPiece());
        }
    }

}
