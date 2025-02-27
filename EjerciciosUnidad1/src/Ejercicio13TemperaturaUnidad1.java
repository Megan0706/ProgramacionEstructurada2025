import javax.swing.*;

public class Ejercicio13TemperaturaUnidad1 {
    public static void main(String[] args) {
        double c=0.0;
        double f =0.0;


        c =Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la temperatura en grados Celsius"));
        f= (9.0/5.0) * c + 32;

        JOptionPane.showMessageDialog(null,  c + " Los grados celcius equivalen a: " + f + " grados Fahrenheiet");

    }
}
