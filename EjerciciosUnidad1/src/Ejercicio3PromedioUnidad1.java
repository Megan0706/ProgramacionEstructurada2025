import javax.swing.*;

public class Ejercicio3PromedioUnidad1 {
    public static void main(String[] args) {

        //Declaracion de variables

        int num1=1, num2=7, num3=9, num4=34;
        double suma= 0.0;
        double promedio=0.0;

        suma = num1 + num2 + num3 + num4;

        promedio = suma /4;

        JOptionPane.showMessageDialog(null, "El promedio total de estos numeros es: " + promedio);
    }
}
