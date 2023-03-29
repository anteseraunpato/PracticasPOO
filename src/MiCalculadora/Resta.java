package MiCalculadora;

import javax.swing.*;

public class Resta {
    int numresta;

    public Resta() {
        numresta = Integer.parseInt(JOptionPane.showInputDialog("¿cuántos números quieres restar?"));
    }

    public int getNumresta() {
        return numresta;
    }

    public void setNumresta(int numresta) {
        this.numresta = numresta;
    }
}
