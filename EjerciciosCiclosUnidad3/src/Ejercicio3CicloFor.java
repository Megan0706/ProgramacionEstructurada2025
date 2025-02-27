import javax.swing.*;

public class Ejercicio3CicloFor {
    public static void main(String[] args) {
        int numero =0;
        String resultado = " ";

         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la tabla de multiplicar:"));

        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

    }
}
