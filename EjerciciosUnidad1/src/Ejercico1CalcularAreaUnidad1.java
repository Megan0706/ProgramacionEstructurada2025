import javax.swing.*;

public class Ejercico1CalcularAreaUnidad1 {
    public static void main(String[] args) {

        //Declaracion de variables
        double pi = 3.1416;
        double diametro= 0.0;
        double area= 0.0;
        double radio =0.0;

        //pedira el valor del diametro
        diametro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del diametro"));

        //Calcularemos el radio de el circulo

        radio= diametro/2;

        //calcular el area
          //math.pow es para poner potencias

        //Mostramos el resultado
        JOptionPane.showMessageDialog(null, "El area del circulo es:  " + area);




    }
}
