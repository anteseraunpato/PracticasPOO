package ExamenPOO;

public class Agua extends Pokemon {

    public int Hidrobomba;
    public int PistolaAgua;

    public Agua(int opt, int pokedex, String nombre, int hidrobomba, int pistolaAgua) {
        super(opt, pokedex, nombre);
        Hidrobomba = hidrobomba;
        PistolaAgua = pistolaAgua;
    }

}
