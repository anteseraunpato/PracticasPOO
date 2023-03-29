package ExamenPOO;

public class Planta extends Pokemon{
    public int LatigoCepa;
    public int Drenadoras;

    public Planta(int opt, int pokedex, String nombre, int latigoCepa, int drenadoras) {
        super(opt, pokedex, nombre);
        LatigoCepa = latigoCepa;
        Drenadoras = drenadoras;
    }

    public int getLatigoCepa() {
        return LatigoCepa;
    }

    public void setLatigoCepa(int latigoCepa) {
        LatigoCepa = latigoCepa;
    }

    public int getDrenadoras() {
        return Drenadoras;
    }

    public void setDrenadoras(int drenadoras) {
        Drenadoras = drenadoras;
    }
}
