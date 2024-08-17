package gt.edu.miumg.PatronMethodFactor.Notificacion;

public class NotificacionEmail implements Notificacion {

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificacion enviada por email");
    }
}
