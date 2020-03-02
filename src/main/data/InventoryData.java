package main.data;

import main.interfaces.Inventory;
import main.model.AppleModel;

import java.util.ArrayList;
import java.util.List;

public class InventoryData implements Inventory {

    @Override
    /**
     * este metodo sirve para la creacion de la lista con un modelo AppleModel
     *
     * @return regresa una lista con el tipo de modelo asignado
     */
    public List<AppleModel> creaList() {
         return new ArrayList<>();
    }

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
    public boolean llenarList(List<AppleModel> list, int weight, String color, int pieces) {
        AppleModel a = new AppleModel();
        a.setWeight(weight);
        a.setColor(color);
        a.setPiece(pieces);
        return list.add(a);
    }

    @Override
    /**
     * este metodo sirve para el llenado de una lista de forma manual
     *
     * @param list es la lista a llenar con el modelo de AppleModel
     */
    public void cargarDatos(List<AppleModel> list) {
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
    public void mostrarList(List<AppleModel> list) {
        for (AppleModel x : list) {
            System.out.println(x.getWeight() + " - " + x.getColor() + " - " + x.getPiece());
        }
    }

}
