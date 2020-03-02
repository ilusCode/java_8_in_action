package main.interfaces;

import main.model.TransactionModel;

import java.util.Currency;
import java.util.List;

public interface Transactions {
    List<TransactionModel> creaList();
    boolean llenarList(List<TransactionModel> list, int price, Currency currency);
    void cargarDatos(List<TransactionModel> list);
    void mostrarList(List<TransactionModel> list);
}
