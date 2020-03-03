package main.interfaces;

import main.model.transactionModel;

import java.util.Currency;
import java.util.List;

public interface transactions {

    boolean llenarList(List<transactionModel> list, int price, Currency currency);

    void cargarDatos(List<transactionModel> list);

    void mostrarList(List<transactionModel> list);
}
