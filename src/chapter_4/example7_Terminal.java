package chapter_4;

import main.Genericos;
import main.data.DishData;

public class example7_Terminal {
    /**
     * este metodo realiza una imprecion especifica a comparaacion de terminalOperation que solo imprime el objeto
     */
    private static void specific() {
        Genericos.menu.stream().forEach(d -> {
            System.out.println(d.getName());
        });
    }

    /**
     * este metodo hace uso de una referencia estatica hacia println, sin embargo, se uestra todo el objeto
     */
    private static void terminalOperation() {
        Genericos.menu.stream().forEach(System.out::println);
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample7() {
        DishData dd = new DishData();
        dd.loadData(Genericos.menu);
        terminalOperation();
        specific();
    }

    public static void main(String[] args) {
        testExample7();
    }
}
