package main;

import main.interfaces.funcionales.predicate;

import java.util.ArrayList;
import java.util.List;

public class Genericos {

    /**
     * Este metodo cumple la funcion de filtrar sin embargo lo puede realizar con cualquier tipo de objeto
     *
     * @param list
     * @param p
     * @param <T>  se refiere a un objeto generico
     * @return
     */
    public static <T> List<T> filter(List<T> list, predicate<T> p) {
        List<T> res = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                res.add(e);
            }
        }
        return res;
    }

    /**
     * este metodo sirve para la creacion de la lista con un modelo appleModel
     *
     * @return regresa una lista con el tipo de modelo asignado
     */

    public static <T> List<T> creaList() {
        return new ArrayList<>();
    }

    /**
     * este metodo sirve para realizar una impresion de una lista
     *
     * @param list
     */
    public static <T> void mostrarList(List<T> list) {
        for (T x : list) {
            System.out.println(x.toString());
        }
    }

    /**
     * este metodo sirve para identificar el ejemplo al que se le esta haciendo la pruebe
     *
     * @param chapter se refiere al capitulo del ejemplo
     * @param title   se refiere al titulo del ejemplo
     * @param msg     se refiere a una descripcion del ejemplo
     */
    public static void comentar(String chapter, String title, String msg,String line_break) {
        if (!chapter.equals("") || !chapter.equals(null)) {
            System.out.println(chapter);
        }
        if (!title.equals("") || !title.equals(null)) {
            System.out.println(title);
        }
        if (!msg.equals("") || !msg.equals(null)) {
            System.out.println(msg);
        }
        System.out.println(line_break);
    }

    /**
     * este metodo sirve para inicializar los hilos
     *
     * @param r el parametro r es el nombre del hilo previamente creado
     */
    public static void process(Runnable r) {
        r.run();
    }
}
