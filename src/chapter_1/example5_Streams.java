package chapter_1;

import main.data.transactionsData;
import main.model.transactionModel;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static main.Genericos.comentar;
import static main.Genericos.creaList;

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
    public static void mapeo(List<transactionModel> transactions) {
        Map<Currency, List<transactionModel>> transactionsByCurrencies = new HashMap<>();
        for (transactionModel tr : transactions) {
            if (tr.getPrice() < 10) {
                Currency c = tr.getCurrency();
                List<transactionModel> transactionsForCurrency = transactionsByCurrencies.get(c);
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
    public static void mapeoStreams(List<transactionModel> transactions) {
        Map<Currency, List<transactionModel>> transactionsByCurrencies = transactions.stream().filter((transactionModel t) -> t.getPrice() > 15).collect(groupingBy(transactionModel::getCurrency));
        System.out.println(transactionsByCurrencies.keySet());
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     *
     * @deprecated mapeoStreams
     */
    @Deprecated
    public static void testExample5() {
        comentar("Capitulo 1", "Example #5", "", "--------------------------------");
        transactionsData t = new transactionsData();
        List<transactionModel> transactions = creaList();
        t.cargarDatos(transactions);
        t.mostrarList(transactions);
        mapeo(transactions);
        mapeoStreams(transactions);
    }
}
