import javax.swing.*;

public class Ejercicio1CicloFor {
    public static void main(String[] args) {
        double calif =0.0;
        double acumCalif= 0.0;
        int numCalif= 0;

        numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de calificaciones: "));

        for (int i = 0; i <numCalif ; i++) {
            acumCalif += Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificación: "));
        }
            calif=  acumCalif/numCalif;

        JOptionPane.showMessageDialog(null ,"El promedio es: "+ calif);
    }
}
