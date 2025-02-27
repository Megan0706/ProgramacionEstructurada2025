import javax.swing.*;

public class Ejercicio11ObtenerxUnidad1 {
    public static void main(String[] args) {
        double y = 0.0;
        double a = 3.0;
        double b = 7;
        double c = -15 - y;
        double operacion = 0.0;
        double x1 = 0.0;
        double x2 = 0.0;
        double operacion2 =0.0;


        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor el Y "));

        operacion = (b * b) - 4 * (a * c);


        if (operacion >= 0) {

        x1 = (-b + Math.sqrt(operacion)) / (2 * a);
        x2 = (-b - Math.sqrt(operacion)) / (2 * a);
        JOptionPane.showMessageDialog(null, "Las solucion para x1 son: " + x1 + "\nLa solucion para x2 es: " + x2);


         } else if (operacion==0) {
            operacion2 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "La solucion de x es: " + operacion2);

        } else {
            JOptionPane.showMessageDialog(null, "No existe solucion alguna");

        }


    }

}
