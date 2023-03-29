package Examen;

public class Starter extends Pokemon{
    public int AtaqueUnico;

    public Starter(int opt, int pokedex, String nombre, int ataqueUnico) {
        super(opt, pokedex, nombre);
        AtaqueUnico = ataqueUnico;
    }

    public int getAtaqueUnico() {
        return AtaqueUnico;
    }

    public void setAtaqueUnico(int ataqueUnico) {
        AtaqueUnico = ataqueUnico;
    }
}
