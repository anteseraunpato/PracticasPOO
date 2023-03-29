package ExamenPOO;

public class Electrico extends Pokemon{
    public int Impactrueno;
    public int PunioTrueno;

    public Electrico(int opt, int pokedex, String nombre, int impactrueno, int punioTrueno) {
        super(opt, pokedex, nombre);
        Impactrueno = impactrueno;
        PunioTrueno = punioTrueno;
    }

    public int getImpactrueno() {
        return Impactrueno;
    }

    public void setImpactrueno(int impactrueno) {
        Impactrueno = impactrueno;
    }

    public int getPunioTrueno() {
        return PunioTrueno;
    }

    public void setPunioTrueno(int punioTrueno) {
        PunioTrueno = punioTrueno;
    }
}
