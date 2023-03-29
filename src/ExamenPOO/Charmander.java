package ExamenPOO;

public class Charmander extends Fuego{
    public int Ascuas;

    public Charmander(int opt, int pokedex, String nombre, int llamarada, int lanzallamas, int ascuas) {
        super(opt, pokedex, nombre, llamarada, lanzallamas);
        Ascuas = ascuas;
    }

    public int getAscuas() {
        return Ascuas;
    }

    public void setAscuas(int ascuas) {
        Ascuas = ascuas;
    }
}
