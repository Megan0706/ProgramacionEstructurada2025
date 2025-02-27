import javax.swing.*;

public class CiclowhileEjercicio3 {
    public static void main(String[] args) {
        int i = 0;
        int h = 0;
        int m = 0;
        int n =0;
        String genero = " ";



       n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas: "));

        while (i < n) {
            genero = JOptionPane.showInputDialog("Ingrese el género de la personan\n " + (i + 1) + " (1) si eres Mujer/2) si eres hoombre):");

            if (genero.equalsIgnoreCase("1")) {
                h++;
            } else if (genero.equalsIgnoreCase("2")) {
                m++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Hay " + h + " hombres y " + m + " mujeres.");
    }
    }

