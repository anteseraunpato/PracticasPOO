package ExamenPOO;

public class Fuego extends Pokemon {
    public int Llamarada;
    public int Lanzallamas;

    public Fuego(int opt, int pokedex, String nombre, int llamarada, int lanzallamas) {
        super(opt, pokedex, nombre);
        Llamarada = llamarada;
        Lanzallamas = lanzallamas;
    }

    public int getLlamarada() {
        return Llamarada;
    }

    public void setLlamarada(int llamarada) {
        Llamarada = llamarada;
    }

    public int getLanzallamas() {
        return Lanzallamas;
    }

    public void setLanzallamas(int lanzallamas) {
        Lanzallamas = lanzallamas;
    }
}
