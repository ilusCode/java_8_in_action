package chapter_1.data;

import chapter_1.model.TransactionModel;

import java.util.*;

public class TransactionsData {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private TransactionsData() {
    }

    public static List<TransactionModel> creaList() {
        List<TransactionModel> t = new ArrayList<TransactionModel>();
        return t;
    }

    ;

    public static boolean llenarList(List<TransactionModel> tm, int price, Currency currency) {
        TransactionModel t = new TransactionModel();
        t.setPrice(price);
        t.setCurrency(currency);
        return tm.add(t);
    }

    public static void cargarDatos(List<TransactionModel> tm) {
        llenarList(tm, 21, Currency.getInstance(Locale.CHINA));
        llenarList(tm, 23, Currency.getInstance(Locale.TAIWAN));
        llenarList(tm, 43, Currency.getInstance(Locale.FRANCE));
        llenarList(tm, 12, Currency.getInstance(Locale.GERMANY));
        llenarList(tm, 53, Currency.getInstance(Locale.KOREA));
    }

    public static void mostrarList(List<TransactionModel> list) {
        for (TransactionModel tm : list) {
            System.out.println(tm.getPrice() + " - " + tm.getCurrency());
        }
    }
}
