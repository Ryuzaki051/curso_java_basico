package MC_30_39;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class LinkedList38 {
    public static void main(String... listas){
        //Formas de implementar el instanciamiento de listas
        List<String> lista1=new LinkedList();
        List lista2=new LinkedList();
        LinkedList lista4=new LinkedList();
        LinkedList<String> lista5=new LinkedList();
        //***********************************************
        
        List<Integer> lista3=new LinkedList();
        lista3.add(1);
        lista3.add(2);
        lista3.add(3);
        
        System.out.println("Conocer su tamaño: "+lista3.size());
        System.out.println("Obtener elemento de la lista: "+lista3.get(0));
        System.out.println("Obtener el ultimo elemento: "+lista3.get(lista3.size()-1));
        // Linked List es recomendable para agregar o remover elementos de la lista
        
        // Mientras que ArrayList es bueno para realizar busqueda de elementos
         
    }   
}