package gt.edu.miumg.PatronMethodFactor.NotificacionFactory;

import gt.edu.miumg.PatronMethodFactor.Notificacion.Notificacion;
import gt.edu.miumg.PatronMethodFactor.Notificacion.NotificacionEmail;

public class EmailNotificacionFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
