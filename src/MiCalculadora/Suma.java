package MiCalculadora;

import javax.swing.*;

public class Suma {
    int numsuma;

    public Suma() {
        numsuma = Integer.parseInt(JOptionPane.showInputDialog("¿cuántos números quieres sumar?"));
    }

    public int getNumsuma() {
        return numsuma;
    }

    public void setNumsuma(int numsuma) {
        this.numsuma = numsuma;
    }
}
