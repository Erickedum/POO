package collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        //imprimir(miLista);

       Set miSet = new HashSet();
       miSet.add(11111);
       miSet.add(22222);
       miSet.add(33333);
       miSet.add(44444);
       miSet.add(55555);
       //imprimir(miSet);

       Map miMap = new HashMap();
       miMap.put("1", "Juan");
       miMap.put("2", "Pedro");
       miMap.put("3", "Pablo");
       miMap.put("4", "Erick");
       miMap.put("5", "Jose");
        System.out.println(miMap.keySet());
        System.out.println(miMap.values());

       //imprimir(miMap.keySet());
       //imprimir(miMap.values());
    }

    /*public static void imprimir(Collection coleccion){
        coleccion.forEach(semana ->{
            System.out.println(semana);
        });
    }*/
}
