import javax.swing.*;

public class CiclowhileEjercicio8 {
    public static void main(String[] args) {
        int n=0;
        int i = 0;
        double mayor = Double.MIN_VALUE;
        double numero =0.0;


         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));


        while (i < n) {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero > mayor) {
                mayor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor valor es " + mayor);
    }
}
