package Examen;

public class Planta extends Starter{
    public int LatigoCepa;
    public int Drenadoras;

    public Planta(int opt, int pokedex, String nombre, int ataqueUnico, int latigoCepa, int drenadoras) {
        super(opt, pokedex, nombre, ataqueUnico);
        LatigoCepa = latigoCepa;
        Drenadoras = drenadoras;
    }

    @Override
    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:" +
                "\nNúmero en la Pokedex: 00" + Pokedex +
                "\n\n--- Daño que causan sus ataques ---\n"+
                "\nLátigo Cepa = " + LatigoCepa +
                "\nDrenadoras = " + Drenadoras +
                "\nSu ataque único es Bala Semilla y causa un daño de " + AtaqueUnico;
    }
}
