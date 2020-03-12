package chapter_3;

import main.Genericos;
import main.model.AppleModel;

import java.util.function.Supplier;

import static main.Genericos.comentar;

/**
 * El ejemplo actual fue extraido del libro Java 8 in action de la pagina 86
 * 3.6.2. Constructor references
 */
public class example17_ConstructorReferences {

    /**
     * Este metodo se creo para realizar un test de uso del los metodos de esta clase
     */
    public static void testExample17() {
        comentar(3, 17, "");
        AppleModel a = useConstructor();
        a.setColor("Gris");
        a.setPiece(10);
        a.setWeight(123);
        System.out.println(a.getPiece() + " - " + a.getColor() + " - " + a.getWeight());

        AppleModel am = useLambda();
        am.setColor("Azul");
        am.setPiece(1);
        am.setWeight(1233);
        System.out.println(am.getPiece() + " - " + am.getColor() + " - " + am.getWeight());
    }

    /**
     * este metodo sirve para crear un objeto tipo {@link AppleModel} utilizando el contructor
     *
     * @return
     */
    private static AppleModel useConstructor() {
        Supplier<AppleModel> s = AppleModel::new;
        return s.get();
    }

    /**
     * este metodo sirve para crear un objeto tipo {@link AppleModel} utilizando lambdas
     *
     * @return
     */
    private static AppleModel useLambda() {
        Supplier<AppleModel> s = () -> new AppleModel();
        return s.get();
    }

    public static void main(String[] args) {
        testExample17();
    }
}