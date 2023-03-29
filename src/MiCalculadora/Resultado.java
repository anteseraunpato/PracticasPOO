package MiCalculadora;

import javax.swing.*;
import java.util.Arrays;

public class Resultado {
    public static void main(String[] args) {
int resultadosuma=0;
        int resultadoresta=0;
        Contrasenia contra = new Contrasenia();

        String verifica = JOptionPane.showInputDialog("Escribe la contraseña");


 if (verifica.equals(contra.getPass())) {

     String oper = JOptionPane.showInputDialog("Elige la operación que quieres realizar \n sumar o restar");

     if (oper.equalsIgnoreCase("sumar")) {
         Suma sumar = new Suma();
         sumar.getNumsuma();
         int matriz[] = new int[sumar.getNumsuma()];


         for (int i = 0; i < (sumar.getNumsuma()); i++) {
             matriz[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el número a sumar"));
             resultadosuma = resultadosuma + matriz[i];
                      }

         System.out.println(resultadosuma);

     } else if (oper.equalsIgnoreCase("restar")) {
         Resta restar = new Resta();
         restar.getNumresta();
         int matriz[] = new int[restar.getNumresta()];
         for (int i=0; i<(restar.getNumresta()); i++) {
             matriz[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el número a restar"));
             resultadoresta = resultadoresta - matriz[i];
             }

         System.out.println(resultadoresta);
     }
     }else {
     JOptionPane.showMessageDialog(null, "tas' pendejo wey, ahí te ves");
 }




    }

        }