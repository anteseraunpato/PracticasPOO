package herencia;

public class Consultor extends Persona{
    String nombre_consultora;
    int num_consultor;

    public Consultor(){
    }

    public Consultor(String nombre_consultora, int num_consultor, int id, String curp, String nombre, String apellido, String domicilio, String telefono){
        super(id, curp, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }


}
