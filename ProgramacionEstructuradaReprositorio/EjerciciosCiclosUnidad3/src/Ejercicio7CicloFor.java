import javax.swing.*;

public class Ejercicio7CicloFor {
    public static void main(String[] args) {
        double suma =0.0;
        double cantidad=0.0;

        for (int i = 1; i <= 10; i++) {
             cantidad= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " + i ));
            suma += cantidad;
        }
        JOptionPane.showMessageDialog(null, "La suma de las diez cantidades es: " + suma);
    }
    }

