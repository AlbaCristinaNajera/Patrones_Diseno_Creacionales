package gt.edu.miumg.PatronAbstractFactory.MueblesFactory;

import gt.edu.miumg.PatronAbstractFactory.Mesa.Mesa;
import gt.edu.miumg.PatronAbstractFactory.Silla.Silla;
import gt.edu.miumg.PatronAbstractFactory.Sofa.Sofa;

public interface MueblesFactory {
    Silla crearSilla();
    Mesa crearMesa();
    Sofa crearSofa();
}
