package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
    List<Persona> lista = new ArrayList<Persona> ();
    lista.add(new Persona(1, "Jahir", 30));
    lista.add(new Persona(2, "Pancho", 30));
    lista.add(new Persona(3, "Juan", 9));
    lista.add(new Persona(4, "Dani", 2));

    // recorrer una lista usando FOR (por índice)

        System.out.println("------usando FOR------");
        for (int i=0; i<lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }

        //recorriso ForEach
        System.out.println("------usando ForEach------");
        for (Persona perso:lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
    }
}
