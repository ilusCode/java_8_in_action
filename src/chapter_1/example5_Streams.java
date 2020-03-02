package chapter_1;

import main.data.TransactionsData;
import main.model.TransactionModel;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 28
 * 1.3. Streams
 */
public class example5_Streams {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example5_Streams() {
    }

    /**
     * Este metodo sirve para realizar un recorrido de una lista por medio de un map
     *
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
     *
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
     *
     * @deprecated mapeoStreams
     */
    @Deprecated
    public static void testExample5() {
        System.out.println("Chapther 1");
        System.out.println("Example #5");
        TransactionsData t = new TransactionsData();
        List<TransactionModel> transactions = t.creaList();
        t.cargarDatos(transactions);
        t.mostrarList(transactions);
        mapeo(transactions);
        mapeoStreams(transactions);
    }
}
