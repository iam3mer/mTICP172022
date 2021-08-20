package utp.misiontic2022.c2.p17.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    
    private final Requerimiento_1Dao requerimiento_1Dao;
    private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return requerimiento_3Dao.requerimiento3();
    }
}
