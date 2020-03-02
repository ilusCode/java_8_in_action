package main.data;

import main.interfaces.transactions;
import main.model.transactionModel;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class transactionsData implements transactions {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    public transactionsData() {
    }

    /**
     * este metodo sirve para la creacion de la lista con un modelo transactionModel
     *
     * @return regresa una lista con el tipo de modelo asignado
     */
    public List<transactionModel> creaList() {
        return new ArrayList<>();
    }

    /**
     * este metodo sirve para la asignacion de valores al objeto de la lista
     *
     * @param list
     * @param price
     * @param currency
     * @return regresa una lista llena con los objetos que se les paso como parametros
     */
    public boolean llenarList(List<transactionModel> list, int price, Currency currency) {
        transactionModel t = new transactionModel();
        t.setPrice(price);
        t.setCurrency(currency);
        return list.add(t);
    }

    /**
     * este metodo sirve para el llenado de una lista de forma manual
     *
     * @param list es la lista a llenar con el modelo de transactionModel
     */
    public void cargarDatos(List<transactionModel> list) {
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
    public void mostrarList(List<transactionModel> list) {
        for (transactionModel tm : list) {
            System.out.println(tm.getPrice() + " - " + tm.getCurrency());
        }
    }
}
