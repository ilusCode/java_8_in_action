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

    /**
     * Este metodo sirve para realizar un recorrido de una lista por medio de un map
     * @param transactions
     * @deprecated c esta variable se le asigna la modena que tiene la transaccion que se esta recorriendo
     */
    @Deprecated
    public static void mapeo(List<TransactionModel> transactions) {
        Map<Currency, List<TransactionModel>> transactionsByCurrencies = new HashMap<>();
        for (TransactionModel tr : transactions) {
            if (tr.getPrice() < 10) {
                Currency c = tr.getCurrency();
                List<TransactionModel> transactionsForCurrency = transactionsByCurrencies.get(c);
                if (transactionsForCurrency == null) {
                    transactionsForCurrency = new ArrayList<>();
                    transactionsByCurrencies.put(c, transactionsForCurrency);
                }
                transactionsForCurrency.add(tr);
            }
        }
    }

    /**
     * Este metodo sirve para realizar un recorrido de una lista por medio de un stream
     * @param transactions
     * @deprecated c esta variable se le asigna la modena que tiene la transaccion que se esta recorriendo
     */
    @Deprecated
    public static void mapeoStreams(List<TransactionModel> transactions) {
        Map<Currency, List<TransactionModel>> transactionsByCurrencies = transactions.stream().filter((TransactionModel t) -> t.getPrice() > 15).collect(groupingBy(TransactionModel::getCurrency));
        System.out.println(transactionsByCurrencies.keySet());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     * @deprecated mapeo
     * @deprecated mapeoStreams
     */
    @Deprecated
    public static void testExample5() {
        System.out.println("Example #5");
        List<TransactionModel> transactions = creaList();
        cargarDatos(transactions);
        mostrarList(transactions);
        mapeo(transactions);
        mapeoStreams(transactions);
    }

    public static void main(String[] args) {
        testExample5();
    }
}
