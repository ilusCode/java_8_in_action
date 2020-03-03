package main.interfaces;

import main.model.appleModel;

import java.util.List;

public interface inventory {
    boolean llenarList(List<appleModel> list, int weight, String color, int pieces);

    void cargarDatos(List<appleModel> list);

    void mostrarList(List<appleModel> list);
}
