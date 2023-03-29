package ExamenPOO;

public class Pokemon {
   protected int Pokedex;
   protected String nombre;
   protected int opt;

   public Pokemon(int opt, int pokedex, String nombre) {
      Pokedex = pokedex;
      this.nombre = nombre;
      this.opt = opt;
   }

   public int getPokedex() {
      return Pokedex;
   }

   public void setPokedex(int pokedex) {
      Pokedex = pokedex;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
}
