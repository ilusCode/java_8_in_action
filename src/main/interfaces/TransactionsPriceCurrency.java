package main.interfaces;

import main.model.TransactionModelPriceCurrency;

import java.util.Currency;
import java.util.List;

public interface TransactionsPriceCurrency {

    boolean llenarList(List<TransactionModelPriceCurrency> list, int price, Currency currency);

    void cargarDatos(List<TransactionModelPriceCurrency> list);

    void mostrarList(List<TransactionModelPriceCurrency> list);
}
