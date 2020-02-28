package chapter_1.examples;

import chapter_1.model.AppleModel;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static chapter_1.data.InventoryData.*;
import static java.util.Comparator.comparing;
/**
 *  El ejemplo actual fue extraido del libro Java 8 in action de la pagina 12
 */
public class example1_Sort {
    /**
     * Este metodo sirve para optimizar el algoritmo de ordenamiento burbuja, en donde se le indica bajo que argumento va hacer el ordenamiento.
    * @param inventory es una lista de datos de una manzana.
    * **/
    public static void sort(List<AppleModel> inventory, String argument){
        if (argument.equals("weight") ){
            Collections.sort(inventory, new Comparator<AppleModel>() {
                @Override
                public int compare(AppleModel o1, AppleModel o2) {
                    return o1.getWeight().compareTo(o2.getWeight());
                }
            });
        }

        //----------------------------- Color -----------------------------

        if (argument.equals("color")){
            Collections.sort(inventory, new Comparator<AppleModel>() {
                @Override
                public int compare(AppleModel o1, AppleModel o2) {
                    return o1.getColor().compareTo(o2.getColor());
                }
            });
        }

        //----------------------------- Piece -----------------------------

        if (argument.equals("piece")){
            System.out.println("sort solor funciona con Strings en versiones menores a Java 8");
        }

    }

    public static void testExample1(){
        System.out.println("Example #1");
        List<AppleModel> x= creaList();
        cargarDatos(x);
        System.out.println("Antes");
        mostrarList(x);
        example1_Sort.sort(x,"color");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ahora");
        x.sort(comparing(AppleModel::getPiece));
        mostrarList(x);
    }
}
