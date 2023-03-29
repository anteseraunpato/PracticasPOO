package Examen;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Hola! hoy es tu primer día como entrenador Pokemon"+
                "\n¡Es peligroso ir solo! \nElige un Pokemon para acompañarte en tu viaje");

        String ElegirTipo=JOptionPane.showInputDialog(null, "¿Qué tipo de Pokemon quieres elegir?" +
                "\nPlanta \nFuego \nAgua \n\nEscribe Random si quieres que elija por ti");
        JOptionPane.showMessageDialog(null, "Elegiste: " + ElegirTipo);

        List<Pokemon> listaPokemon = new ArrayList<Pokemon>();

        Agua agua1 = new Agua(0, 007, "Squirtle", 88, 25, 33);
        Agua agua2 = new Agua(1, 007, "Squirtle", 42, 80, 37);
        Agua agua3 = new Agua(2, 007, "Squirtle", 15, 90, 13);
        Fuego fuego1 = new Fuego(3, 004, "Charmander", 67, 68, 80);
        Fuego fuego2 = new Fuego(4, 004, "Charmander", 85, 47, 48);
        Fuego fuego3 = new Fuego(5, 004, "Charmander", 89, 36, 67);
        Planta planta1 = new Planta(6, 001, "Bulbasaur", 90, 58, 38);
        Planta planta2 = new Planta(7, 001, "Bulbasaur", 95, 39, 70);
        Planta planta3 = new Planta(8, 001, "Bulbasaur", 91, 45, 55);
        Electrico electrico = new Electrico(9, 025, "Pikachu", 95, 85, 74);

        listaPokemon.add(agua1);
        listaPokemon.add(agua2);
        listaPokemon.add(agua3);
        listaPokemon.add(fuego1);
        listaPokemon.add(fuego2);
        listaPokemon.add(fuego3);
        listaPokemon.add(planta1);
        listaPokemon.add(planta2);
        listaPokemon.add(planta3);
        listaPokemon.add(electrico);

                if (ElegirTipo.equalsIgnoreCase("Agua")){
                    int pokeazar= (int)( Math.random() * 3);
    for (Pokemon agua : listaPokemon) {
        while (agua.getOpt() == pokeazar && agua.getPokedex() == 007){
            JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Squirtle\n" + agua.toString());
        break;
        }
    }} else if (ElegirTipo.equalsIgnoreCase("Fuego")) {
                    int pokeazar= (int) (Math.random() * (7 - 3) + 3);
                    for (Pokemon fuego : listaPokemon) {
                        while (fuego.getOpt() == pokeazar && fuego.getPokedex() == 004 ){
                            JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Charmander\n" + fuego.toString());
                            break;
                        }
                    }} else if (ElegirTipo.equalsIgnoreCase("Planta")) {
                    int pokeazar= (int) (Math.random() * (10 - 6) + 6);
                    for (Pokemon planta : listaPokemon) {
                        while (planta.getOpt() == pokeazar && planta.getPokedex() == 001 ){
                            JOptionPane.showMessageDialog(null, "¡Felicidades! Tu Pokemón es Bulbasaur\n" + planta.toString());
                            break;
                        }
                    }
        } else if (ElegirTipo.equalsIgnoreCase("Random")) {
                    JOptionPane.showMessageDialog(null, "¡Genial! \n Déjame pensar...");
                    int pokeazar= (int) (Math.random() * (11 - 1) + 1);
                    for (Pokemon planta : listaPokemon) {
                        while (planta.getOpt() == pokeazar ){
                            JOptionPane.showMessageDialog(null, "¡Lo tengo! El mejor Pokémon para ti es: ¡" + planta.getNombre()+ "!\n" + planta.toString());
                            break;
                        }
                    }
        } else {JOptionPane.showMessageDialog(null, "Parece que el tipo que elegiste " +
                "no está disponible y los Pokemon se han agotado.\n\nBuena suerte la próxima vez");}


    }
}
