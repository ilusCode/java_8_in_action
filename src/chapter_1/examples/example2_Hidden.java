package chapter_1.examples;

import java.io.File;
import java.io.FileFilter;

/**
 *  El ejemplo actual fue extraido del libro Java 8 in action de la pagina 24
 *  Figure 1.4. Passing the method reference File::isHidden to the method listFiles
 */
public class example2_Hidden {
    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example2_Hidden() {
    }

    private static void mostrarhidden(File[] hidden) {
        for (int i = 0; i <hidden.length ; i++) {
            System.out.println(hidden.toString());
        }
    }

    private static void hiddenAct(File[] hidden) {
        hidden=new File(".").listFiles(File::isHidden);
    }

    private static void hiddenAnt(File[] hidden) {
        hidden= new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample2(){
        System.out.println("Example #2");
        File[] hidden = new File[0];
        hiddenAnt(hidden);
        hiddenAct(hidden);
        mostrarhidden(hidden);
    }
}
