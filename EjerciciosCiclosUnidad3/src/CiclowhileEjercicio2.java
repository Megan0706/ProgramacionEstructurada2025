import javax.swing.*;

public class CiclowhileEjercicio2 {
    public static void main(String[] args) {
        int n=0;
        int i=0;
        int horasTrabajadas=0;
        double salario =0.0;


      n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de obreros:"));


        while (i < n) {
             horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el obrero " + (i + 1) + ":"));

            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * 20;
            } else {
                salario = 40 * 20 + (horasTrabajadas - 40) * 25;
            }
            JOptionPane.showMessageDialog(null, "El salario del obrero " + (i + 1) + " es " + salario);
            i++;
        }
    }
}

