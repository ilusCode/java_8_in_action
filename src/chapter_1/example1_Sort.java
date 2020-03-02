package chapter_1;

import main.data.inventoryData;
import main.model.appleModel;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
/**
 *  El ejemplo actual fue extraido del libro Java 8 in action de la pagina 12
 */
public class example1_Sort {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example1_Sort() {
    }

    /**
     * Este metodo sirve para optimizar el algoritmo de ordenamiento burbuja, en donde se le indica bajo que argumento va hacer el ordenamiento.
    * @param inventory es una lista de datos de una manzana.
    * **/
    public static void sort(List<appleModel> inventory, String argument){
        if (argument.equals("weight") ){
            Collections.sort(inventory, new Comparator<appleModel>() {
                @Override
                public int compare(appleModel o1, appleModel o2) {
                    return o1.getWeight().compareTo(o2.getWeight());
                }
            });
        }

        //----------------------------- Color -----------------------------

        if (argument.equals("color")){
            Collections.sort(inventory, new Comparator<appleModel>() {
                @Override
                public int compare(appleModel o1, appleModel o2) {
                    return o1.getColor().compareTo(o2.getColor());
                }
            });
        }

        //----------------------------- Piece -----------------------------

        if (argument.equals("piece")){
            System.out.println("sort solor funciona con Strings en versiones menores a Java 8");
        }

    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample1(){
        System.out.println("Chapther 1");
        System.out.println("Example #1");
        inventoryData d = new inventoryData();
        List<appleModel> x= d.creaList();
        d.cargarDatos(x);
        System.out.println("Antes");
        d.mostrarList(x);
        example1_Sort.sort(x,"color");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ahora");
        x.sort(comparing(appleModel::getPiece));
        d.mostrarList(x);
    }
}
