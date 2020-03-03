package main.data;

import main.interfaces.Inventory;
import main.model.appleModel;

import java.util.List;

public class inventoryData implements Inventory {
    @Override
    /**
     * este metodo sirve para la asignacion de valores al objeto de la lista
     *
     * @param list
     * @param weight
     * @param color
     * @param pieces
     * @return regresa una lista llena con los objetos que se les paso como parametros
     */
    public boolean llenarList(List<appleModel> list, int weight, String color, int pieces) {
        appleModel a = new appleModel();
        a.setWeight(weight);
        a.setColor(color);
        a.setPiece(pieces);
        return list.add(a);
    }

    @Override
    /**
     * este metodo sirve para el llenado de una lista de forma manual
     *
     * @param list es la lista a llenar con el modelo de appleModel
     */
    public void cargarDatos(List<appleModel> list) {
        llenarList(list, 21, "Azul", 12);
        llenarList(list, 23, "Amarilla", 12);
        llenarList(list, 43, "Roja", 3);
        llenarList(list, 12, "Verde", 21);
        llenarList(list, 53, "Verde", 133);
    }

    @Override
    /**
     * este metodo sirve para realizar una impresion de una lista
     *
     * @param list
     */
    public void mostrarList(List<appleModel> list) {
        for (appleModel x : list) {
            System.out.println(x.getWeight() + " - " + x.getColor() + " - " + x.getPiece());
        }
    }

}
