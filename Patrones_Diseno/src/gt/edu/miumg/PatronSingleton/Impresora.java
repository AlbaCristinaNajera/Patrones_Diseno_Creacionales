package gt.edu.miumg.PatronSingleton;

public class Impresora {

    // Crear una instancia estática y privada de la clase
    private static Impresora instanciaUnica;

    // 2. Hacer el constructor privado para evitar que se cree más de una instancia
    private Impresora() {
        System.out.println("Impresión recibida");
    }

    // 3. Método estático público para proporcionar acceso a la única instancia
    public static Impresora getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Impresora();
        }
        return instanciaUnica; // Devolver la misma instancia cada vez que se llama a este método
    }

    // Método para simular la impresión de un documento
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo: " + documento);
    }
}
