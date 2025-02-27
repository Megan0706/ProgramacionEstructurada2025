import javax.swing.*;

public class CiclowhileEjercicio7 {
    public static void main(String[] args) {

        int n=0;
        int i = 0;


         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números: "));


        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));

            }
            i++;
        }

    }

