package gt.edu.miumg.PatronMethodFactor;

import gt.edu.miumg.PatronMethodFactor.Notificacion.Notificacion;
import gt.edu.miumg.PatronMethodFactor.NotificacionFactory.EmailNotificacionFactory;
import gt.edu.miumg.PatronMethodFactor.NotificacionFactory.SmsNotificacionFactory;

public class PruebaNotificacion {
    public static void main(String[] args) {
        Notificacion Email = new EmailNotificacionFactory().crearNotificacion();
        Notificacion Sms = new SmsNotificacionFactory().crearNotificacion();

        Email.enviarNotificacion();
        Sms.enviarNotificacion();

    }
}
