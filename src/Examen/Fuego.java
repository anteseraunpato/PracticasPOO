package Examen;

public class Fuego extends Starter {
    public int Llamarada;
    public int Lanzallamas;

    public Fuego(int opt, int pokedex, String nombre, int ataqueUnico, int llamarada, int lanzallamas) {
        super(opt, pokedex, nombre, ataqueUnico);
        Llamarada = llamarada;
        Lanzallamas = lanzallamas;
    }

    @Override
    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:" +
                "\nNúmero en la Pokedex: 00" + Pokedex +
                "\n\n--- Daño que causan sus ataques ---\n"+
                "\nLlamarada = " + Llamarada +
                "\nLanzallamas = " + Lanzallamas +
                "\nSu ataque único es Ascuas y causa un daño de " + AtaqueUnico;
    }
}
