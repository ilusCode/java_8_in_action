package main.data;

import main.interfaces.Inventory;
import main.model.AppleModel;

import java.util.List;

public class InventoryData implements Inventory {
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
    public boolean loadListMod(List<AppleModel> list, int weight, String color, int pieces) {
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
    public void loadData(List<AppleModel> list) {
        loadListMod(list, 21, "Azul", 12);
        loadListMod(list, 21, "Negra", 12);
        loadListMod(list, 23, "Amarilla", 12);
        loadListMod(list, 43, "Roja", 3);
        loadListMod(list, 12, "Verde", 21);
        loadListMod(list, 53, "Verde", 133);
    }
}
