package ExamenPOO;

public class Pikachu extends Electrico{
    public int Atactrueno;

    public Pikachu(int opt, int pokedex, String nombre, int impactrueno, int punioTrueno, int atactrueno) {
        super(opt, pokedex, nombre, impactrueno, punioTrueno);
        Atactrueno = atactrueno;
    }

    public int getAtactrueno() {
        return Atactrueno;
    }

    public void setAtactrueno(int atactrueno) {
        Atactrueno = atactrueno;
    }
}
