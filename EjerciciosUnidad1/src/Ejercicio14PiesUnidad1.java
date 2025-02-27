import javax.swing.*;

public class Ejercicio14PiesUnidad1 {
    public static void main(String[] args) {

        double pies =0.0;
        double pulgadas =0.0;
        double yardas = 0.0;
        double cm =0.0;
        double metro =0.0;


         pies =Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de pies: "));

         pulgadas = pies *12;
         yardas = pies /3;
         cm = pulgadas*2.54;
         metro = cm /100;

         JOptionPane.showMessageDialog(null, pies + " pies, equivalen a: " + pulgadas + " pulgadas\n" + yardas + " Yardas\n " + cm + " centimetros\n " + metro + " metros");

    }
}
