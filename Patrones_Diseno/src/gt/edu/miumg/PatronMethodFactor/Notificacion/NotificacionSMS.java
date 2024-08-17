package gt.edu.miumg.PatronMethodFactor.Notificacion;

public class NotificacionSMS implements Notificacion {

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificación enviada por SMS");

    }
}
