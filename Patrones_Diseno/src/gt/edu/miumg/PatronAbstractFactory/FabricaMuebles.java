package gt.edu.miumg.PatronAbstractFactory;

import gt.edu.miumg.PatronAbstractFactory.Mesa.Mesa;
import gt.edu.miumg.PatronAbstractFactory.MueblesFactory.MueblesClasicosFactory;
import gt.edu.miumg.PatronAbstractFactory.MueblesFactory.MueblesFactory;
import gt.edu.miumg.PatronAbstractFactory.MueblesFactory.MueblesModernosFactory;
import gt.edu.miumg.PatronAbstractFactory.Silla.Silla;
import gt.edu.miumg.PatronAbstractFactory.Sofa.Sofa;

import java.util.Scanner;

public class FabricaMuebles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****Bienvenido a la fábrica de muebles****");
        System.out.println("1. Moderno");
        System.out.println("2. Clasicos");
        System.out.print("Por favor, elige un estilo de muebles:");

        int eleccion = scanner.nextInt();

        MueblesFactory fabrica;
        switch (eleccion) {
            case 1:
                fabrica = new MueblesModernosFactory();
                System.out.println("Has elegido el estilo Moderno.");
                break;
            case 2:
                fabrica = new MueblesClasicosFactory();
                System.out.println("Has elegido el estilo Clásico.");
                break;
            default:
                System.out.println("Elección no válida. Saliendo del programa.");
                scanner.close();
                return;
        }

        // Crear los muebles según la fábrica seleccionada
        Silla silla = fabrica.crearSilla();
        Mesa mesa = fabrica.crearMesa();
        Sofa sofa = fabrica.crearSofa();

        // Usar los muebles
        silla.sentarse();
        mesa.usarse();
        sofa.recostarse();

        scanner.close();
    }
}
