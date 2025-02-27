import javax.swing.*;

public class CicloLibreEjercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        int i =0;

        for ( i = 100; i >= 0; i =-2) {
            suma=++ i;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}

