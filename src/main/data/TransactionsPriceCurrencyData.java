package main.data;

import main.interfaces.TransactionsPriceCurrency;
import main.model.TransactionModelPriceCurrency;

import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class TransactionsPriceCurrencyData implements TransactionsPriceCurrency {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    public TransactionsPriceCurrencyData() {
    }

    /**
     * este metodo sirve para la asignacion de valores al objeto de la lista
     *
     * @param list
     * @param price
     * @param currency
     * @return regresa una lista llena con los objetos que se les paso como parametros
     */
    public boolean llenarList(List<TransactionModelPriceCurrency> list, int price, Currency currency) {
        TransactionModelPriceCurrency t = new TransactionModelPriceCurrency();
        t.setPrice(price);
        t.setCurrency(currency);
        return list.add(t);
    }

    /**
     * este metodo sirve para el llenado de una lista de forma manual
     *
     * @param list es la lista a llenar con el modelo de TransactionModel
     */
    public void cargarDatos(List<TransactionModelPriceCurrency> list) {
        llenarList(list, 21, Currency.getInstance(Locale.CHINA));
        llenarList(list, 23, Currency.getInstance(Locale.TAIWAN));
        llenarList(list, 43, Currency.getInstance(Locale.FRANCE));
        llenarList(list, 12, Currency.getInstance(Locale.GERMANY));
        llenarList(list, 53, Currency.getInstance(Locale.KOREA));
    }

    /**
     * este metodo sirve para realizar una impresion de una lista
     *
     * @param list
     */
    public void mostrarList(List<TransactionModelPriceCurrency> list) {
        for (TransactionModelPriceCurrency tm : list) {
            System.out.println(tm.getPrice() + " - " + tm.getCurrency());
        }
    }
}
