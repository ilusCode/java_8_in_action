package chapter_3;

import main.interfaces.funcionales.Function;
import main.model.AppleModel;

import static main.Genericos.comentar;

public class example18_ {

    /**
     * Este metodo realiza la transformacion de un {@link Integer} a un objeto {@link AppleModel}, ademas, asigna
     * el valor color del objeto {@link AppleModel}
     */
    private static void fuction3() {
        Function<String, AppleModel> f3 = (color) -> new AppleModel(color);
        AppleModel am3 = f3.apply("Purpura");
        System.out.println(am3.getColor());
    }

    /**
     * Este metodo realiza la transformacion de un {@link Integer} a un objeto {@link AppleModel}, ademas, asigna
     * el valor weight del objeto {@link AppleModel}
     */
    private static void fuction2() {
        Function<Integer, AppleModel> f2 = (weight) -> new AppleModel(weight);
        AppleModel am2 = f2.apply(110);
        System.out.println(am2.getWeight());
    }

    /**
     * Este metodo realiza la transformacion de un {@link Integer} a un objeto {@link AppleModel},
     * pero marca un error deribado a que en el modelo {@link AppleModel} existen dos valores int
     * weight, color
     */
    private static void fuction1() {
        Function<Integer, AppleModel> f = AppleModel::new;
        AppleModel am1 = f.apply(110);
        System.out.println(am1);
    }

    public static void testExample18() {
        fuction1();
        comentar("", "", "");
        fuction2();
        comentar("", "", "");
        fuction3();
    }

    public static void main(String[] args) {
        testExample18();
    }
}
