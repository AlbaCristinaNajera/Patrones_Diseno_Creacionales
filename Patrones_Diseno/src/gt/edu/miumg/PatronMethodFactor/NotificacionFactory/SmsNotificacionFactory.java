package gt.edu.miumg.PatronMethodFactor.NotificacionFactory;

import gt.edu.miumg.PatronMethodFactor.Notificacion.Notificacion;
import gt.edu.miumg.PatronMethodFactor.Notificacion.NotificacionSMS;

public class SmsNotificacionFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
