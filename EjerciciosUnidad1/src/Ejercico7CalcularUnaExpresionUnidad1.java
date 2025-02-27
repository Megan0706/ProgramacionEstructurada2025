import javax.swing.*;

public class Ejercico7CalcularUnaExpresionUnidad1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        double n =0.0;
        double suma =0.0;
        double resta =0.0;


        suma = x + y;
        resta = y - 1;
         n = suma / resta;

        JOptionPane.showMessageDialog(null, "El resultado final de la expresion es: " + n);



    }
}
