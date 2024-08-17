package gt.edu.miumg.PatronAbstractFactory.MueblesFactory;

import gt.edu.miumg.PatronAbstractFactory.Mesa.Mesa;
import gt.edu.miumg.PatronAbstractFactory.Mesa.MesaModerna;
import gt.edu.miumg.PatronAbstractFactory.Silla.Silla;
import gt.edu.miumg.PatronAbstractFactory.Silla.SillaModerna;
import gt.edu.miumg.PatronAbstractFactory.Sofa.Sofa;
import gt.edu.miumg.PatronAbstractFactory.Sofa.SofaModerno;

public class MueblesModernosFactory implements MueblesFactory {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }
}
