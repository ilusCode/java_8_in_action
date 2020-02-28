package chapter_1.examples;

import chapter_1.model.TransactionModel;

import java.util.*;

import static chapter_1.data.TransactionsData.*;
import static java.util.stream.Collectors.groupingBy;

public class example5_Streams {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example5_Streams() {
    }

    public static void mapeo(List<TransactionModel> transactions) {
        Map<Currency, List<TransactionModel>> transactionsByCurrencies = new HashMap<>();
        for (TransactionModel tr : transactions) {
            if (tr.getPrice() < 10) {
                Currency currency = tr.getCurrency();
                List<TransactionModel> transactionsForCurrency = transactionsByCurrencies.get(currency);
                if (transactionsForCurrency == null) {
                    transactionsForCurrency = new ArrayList<>();
                    transactionsByCurrencies.put(currency, transactionsForCurrency);
                }
                transactionsForCurrency.add(tr);
            }
        }
    }

    public static void mapeoStreams(List<TransactionModel> transactions) {
        Map<Currency, List<TransactionModel>> transactionsByCurrencies = transactions.stream().filter((TransactionModel t) -> t.getPrice() > 15).collect(groupingBy(TransactionModel::getCurrency));
        System.out.println(transactionsByCurrencies.keySet());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample5() {
        System.out.println("Example #5");
        List<TransactionModel> transactions = creaList();
        cargarDatos(transactions);
        mostrarList(transactions);
        //mapeo(transactions);
        mapeoStreams(transactions);
    }

    public static void main(String[] args) {
        testExample5();
    }
}
