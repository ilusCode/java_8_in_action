package main;

import main.interfaces.funcionales.BufferedReaderProcessor;
import main.interfaces.funcionales.Consumer;
import main.interfaces.funcionales.Function;
import main.model.AppleModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Genericos {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private Genericos() {
    }

    /**
     * Este metodo cumple la funcion de filtrar sin embargo lo puede realizar con cualquier tipo de objeto
     *
     * @param list
     * @param p
     * @param <T>  se refiere a un objeto generico
     * @return
     */
    public static <T> List<T> filterMod(List<T> list, main.interfaces.funcionales.Predicate<T> p) {
        List<T> res = creaList();
        for (T e : list) {
            if (p.test(e)) {
                res.add(e);
            }
        }
        return res;
    }

    /**
     * Este metodo cumple la funcion de filtrar sin embargo lo puede realizar con cualquier tipo de objeto
     *
     * @param list
     * @param p
     * @param <T>  se refiere a un objeto generico
     * @return
     */
    public static <T> List<T> filterGen(List<T> list, Predicate<T> p) {
        List<T> res = creaList();
        for (T e : list) {
            if (p.test(e)) {
                res.add(e);
            }
        }
        return res;
    }

    /**
     * este metodo sirve para la creacion de la lista con un modelo AppleModel
     *
     * @return regresa una lista con el tipo de modelo asignado
     */

    public static <T> List<T> creaList() {
        return new ArrayList<>();
    }

    /**
     * este metodo sirve para validar la funcionalidad de un Consumer
     *
     * @param list
     * @param c
     * @param <T>
     */
    public static <T> void accept(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }

    /**
     * este metodo sirve para realizar una impresion de una lista
     *
     * @param list
     */
    public static <T> void showListGen(List<T> list) {
        for (T x : list) {
            System.out.println(x.toString());
        }
    }

    /**
     * este metodo sirve para realizar una impresion de una lista
     *
     * @param list
     */
    public static void showListMod(List<AppleModel> list) {
        for (AppleModel x : list) {
            System.out.println(x.getWeight() + " - " + x.getColor() + " - " + x.getPiece());
        }
    }

    /**
     * este metodo sirve para identificar el ejemplo al que se le esta haciendo la pruebe
     *
     * @param chapter se refiere al capitulo del ejemplo
     * @param title   se refiere al titulo del ejemplo
     * @param msg     se refiere a una descripcion del ejemplo
     */
    public static void comentar(String chapter, String title, String msg) {
        if (!chapter.equals("")) {
            System.out.println(chapter);
        }
        if (!title.equals("")) {
            System.out.println(title);
        }
        if (!msg.equals("")) {
            System.out.println(msg);
        }
        System.out.println("------------------------------");
    }

    /**
     * este metodo sirve para inicializar los hilos
     *
     * @param r el parametro r es el nombre del hilo previamente creado
     */
    public static void process(Runnable r) {
        r.run();
    }

    /**
     * @param p
     * @return
     * @throws IOException
     */
    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

    public static <T, R> List<R> apply(List<T> list, Function<T, R> f) {
        List<R> res = new ArrayList<>();
        for (T s : list) {
            res.add(f.apply(s));
        }
        return res;
    }
}
