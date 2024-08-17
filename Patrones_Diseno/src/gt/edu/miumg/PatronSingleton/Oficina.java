package gt.edu.miumg.PatronSingleton;

public class Oficina {
    public static void main(String[] args) {
        // Obtener la única instancia de la impresora
        Impresora impresora1 = Impresora.getInstance();
        Impresora impresora2 = Impresora.getInstance();

        // Ambas variables apuntan a la misma instancia de impresora
        impresora1.imprimirDocumento("Documento de la computadora 1");
        impresora2.imprimirDocumento("Documento de la computadora 2");

        // Verificar si ambas variables se refieren a la misma instancia
        if (impresora1 == impresora2) {
            System.out.println("Ambas computadoras usan la misma impresora.");
        }
    }
}
