package gt.edu.miumg.PatronAbstractFactory.MueblesFactory;

import gt.edu.miumg.PatronAbstractFactory.Mesa.Mesa;
import gt.edu.miumg.PatronAbstractFactory.Mesa.MesaClasica;
import gt.edu.miumg.PatronAbstractFactory.Silla.Silla;
import gt.edu.miumg.PatronAbstractFactory.Silla.SillaClasica;
import gt.edu.miumg.PatronAbstractFactory.Sofa.Sofa;
import gt.edu.miumg.PatronAbstractFactory.Sofa.SofaClasico;

public class MueblesClasicosFactory implements MueblesFactory {

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaClasico();
    }
}
