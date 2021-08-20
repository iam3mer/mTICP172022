package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> registros_r1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 registo : registros_r1) {
                System.out.printf("%s %s %d\n",
                    registo.getLider(),
                    registo.getCargo(),
                    registo.getProyectos()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> registros_r2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 registo : registros_r2) {
                System.out.printf("%d %s %d %d %d\n",
                    registo.getIdmc(),
                    registo.getMaterial(),
                    registo.getCantidad(),
                    registo.getpUnidad(),
                    registo.getpTotal()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> registros_r3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 registo : registros_r3) {
                System.out.printf("%d %s %s %d\n",
                    registo.getId(),
                    registo.getCiudad(),
                    registo.getClasificacion(),
                    registo.getCosto()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
