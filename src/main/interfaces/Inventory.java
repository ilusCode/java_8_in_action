package main.interfaces;

import main.model.AppleModel;

import java.util.List;

public interface Inventory {
    boolean llenarList(List<AppleModel> list, int weight, String color, int pieces);

    void cargarDatos(List<AppleModel> list);

    void mostrarList(List<AppleModel> list);
}
