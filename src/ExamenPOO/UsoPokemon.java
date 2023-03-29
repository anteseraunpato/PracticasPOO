package ExamenPOO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UsoPokemon {
    public static void main(String[] args) {
//Pikachu 025 Charmander 004, Bulbasaur 001, Squirtle 007

        JOptionPane.showMessageDialog(null, "Hola, hoy es tu primer día como entrenador Pokemon");

        String ElegirTipo=JOptionPane.showInputDialog(null, "¿Qué tipo de Pokemón te gustaría elegir?" +
                "\nPlanta \nFuego \n Agua \n Eléctrico");
        JOptionPane.showMessageDialog(null, "Elegiste el tipo: " + ElegirTipo);

        List<Pokemon> listaStarter = new ArrayList<Pokemon>();

        Squirtle squirtle1 = new Squirtle(1,007, "Squirtle", 28, 86, 88);
        Squirtle squirtle2 = new Squirtle(2,007, "Squirtle", 88, 16, 76);
        Squirtle squirtle3 = new Squirtle(3,007, "Squirtle", 45, 33, 98);
        Squirtle squirtle4 = new Squirtle(4,007, "Bulbasaur", 45, 33, 98);

        //Añade los Squirtles disponibles a la lista
        listaStarter.add(squirtle1);
        listaStarter.add(squirtle2);
        listaStarter.add(squirtle3);
        listaStarter.add(squirtle4);

        //Revisa que el usuario haya elegido el tipo agua
        if (ElegirTipo.equalsIgnoreCase("Agua")) {
            //Recorre cada elemento de la lista de Starters
            for (Pokemon squirtle : listaStarter) {
                //Si el nombre del Pokemon es Squirtle muestra sus estadísticas
            if (squirtle.getNombre().equalsIgnoreCase("Squirtle")) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Bulbasaur\n" + squirtle.toString());
            }
            }
        }

        if (ElegirTipo.equalsIgnoreCase("Planta")) {
            //Recorre cada elemento de la lista de Starters
            for (Pokemon squirtle : listaStarter) {
                //Si el nombre del Pokemon es Bulbasaur muestra sus estadísticas
                if (squirtle.getNombre().equalsIgnoreCase("Bulbasaur")) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Squirtle\n" + squirtle.toString());
                }
            }
        }

        if (ElegirTipo.equalsIgnoreCase("Fuego")) {
            //Recorre cada elemento de la lista de Starters
            for (Pokemon squirtle : listaStarter) {
                //Si el nombre del Pokemon es Bulbasaur muestra sus estadísticas
                if (squirtle.getNombre().equalsIgnoreCase("Bulbasaur")) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Squirtle\n" + squirtle.toString());
                }
            }
        }

        if (ElegirTipo.equalsIgnoreCase("Electrico")) {
            //Recorre cada elemento de la lista de Starters
            for (Pokemon squirtle : listaStarter) {
                //Si el nombre del Pokemon es Bulbasaur muestra sus estadísticas
                if (squirtle.getNombre().equalsIgnoreCase("Bulbasaur")) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Squirtle\n" + squirtle.toString());
                }
            }
        }





    }
}
