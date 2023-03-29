package ExamenPOO;

public class Squirtle extends Agua{
    public int Burbujas;

    public Squirtle(int opt, int pokedex, String nombre, int hidrobomba, int pistolaAgua, int burbujas) {
        super(opt, pokedex, nombre, hidrobomba, pistolaAgua);
        Burbujas = burbujas;
    }

    public int getBurbujas() {
        return Burbujas;
    }

    public void setBurbujas(int burbujas) {
        Burbujas = burbujas;
    }

    @Override
    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:" +
                "\nNúmero en la Pokedex: 00" + Pokedex +
                "\n" +
                "\n--- Daño que causan sus ataques ---"+
                "\nBurbujas: " + Burbujas +
                "\nHidrobomba: " + Hidrobomba +
                "\nPistola Agua: " + PistolaAgua +
                '\n';
    }
}
