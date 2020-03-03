package chapter_2;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 54
 * 2.4.2. Executing a block of code with Runnable
 */
public class example15_Thread {

    /**
     * Se crean los contructores privados derivado a una recomendacion de Sonar
     */
    private example15_Thread() {
    }

    /**
     * este metodo sirve para crear un hilo de forma tradicional
     * @return regresa un hilo
     */
    public static Thread createThread() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hilos");
            }
        });
    }

    /**
     * este metodo sirve para la creacion de un hilo con lamnbdas
     * @return regresa un hilo
     */
    public static Thread createThreadWithLamnbda() {
        return new Thread(() -> System.out.println("Hilos Lambda"));
    }

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample15() {
        comentar("Capitulo 2", "Example #15", "", "--------------------------------");
        Thread t1 = createThread();
        Thread t2 = createThreadWithLamnbda();
        t1.start();
        t2.start();
    }
}
