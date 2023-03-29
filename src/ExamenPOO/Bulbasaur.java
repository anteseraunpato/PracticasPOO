package ExamenPOO;

public class Bulbasaur extends Planta {
    public int RayoSolar;

    public Bulbasaur(int opt, int pokedex, String nombre, int latigoCepa, int drenadoras, int rayoSolar) {
        super(opt, pokedex, nombre, latigoCepa, drenadoras);
        RayoSolar = rayoSolar;
    }

    public int getRayoSolar() {
        return RayoSolar;
    }

    public void setRayoSolar(int rayoSolar) {
        RayoSolar = rayoSolar;
    }
}
