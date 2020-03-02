package chapter_2;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 49
 * Quiz 2.2: Anonymous class puzzler
 */
public class example12_Anonymous_Class_Puzzler {
    public final int value = 4;

    /**
     * este metodo sirve para ver los nivels de alcance de una variable
     */
    public void doIt() {
        int val = 6;
        Runnable r = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample12() {
        example12_Anonymous_Class_Puzzler class_puzzler = new example12_Anonymous_Class_Puzzler();
        class_puzzler.doIt();
    }
}
