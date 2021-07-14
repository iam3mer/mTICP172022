package utp.misiontic2022.c2.p17.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //listas();
        //conjuntos();
        mapas();
    }

    public static void listas(){
        System.out.println("Lista de Objetos");

        MiObjeto miobjeto = new MiObjeto(); 

        List<Object> listaObjetos = new ArrayList<>();

        listaObjetos.add(7);
        listaObjetos.add(345);
        listaObjetos.add(2, 4.8);
        listaObjetos.add(miobjeto);

        // for tradicional
        for (int i = 0; i < listaObjetos.size(); i++) {
            System.out.println(listaObjetos.get(i));
        }

        listaObjetos.remove(miobjeto);
        listaObjetos.get(listaObjetos.indexOf(4.8));

        // Foreach
        System.out.println("---Foreach---");
        for (Object object: listaObjetos){
            System.out.println(object);
        }

        // Iterator
        System.out.println("---Iterator---");
        Iterator<Object> iterador = listaObjetos.iterator();
        while (iterador.hasNext()){
            Object objeto = iterador.next();
            System.out.println(objeto);
        }

        // forEach
        System.out.println("---forEach - lambda---");
        List<Integer> listaEnteros = new ArrayList<>();

        listaEnteros.add(5);
        listaEnteros.add(6);
        listaEnteros.add(2);
        listaEnteros.add(4);

        listaEnteros.forEach((entero) -> {
            Integer auxEntero = entero * 2;
            System.out.println(auxEntero);
        });
    }

    public static void conjuntos(){
        Set<Integer> conjunto = new LinkedHashSet<>();

        //conjunto.add(new MiObjeto());
        conjunto.add(7);
        conjunto.add(34);
        conjunto.add(7);
        conjunto.add(2);

        System.out.println(conjunto);

        for (Integer num: conjunto){
            System.out.println(num);
        }
    }

    public static void mapas(){
        Map<String, Object> mapa = new HashMap<>();

        mapa.put("llave", "Valor");
        mapa.put("Nota", 4.5);
        mapa.put("Estudiante", "Andres");
        mapa.put("Curso", "Programación");

        System.out.println(mapa);
        System.out.println(mapa.containsKey("Curso")); // consultar si una llave existe
        System.out.println(mapa.containsValue(4.5)); // consultar si un valor existe

        System.out.println(mapa.values());
        Set<String> llaves = mapa.keySet();
        for (String llave : llaves) {
            System.out.println(llave +":"+ mapa.get(llave));
        }

    }
}
