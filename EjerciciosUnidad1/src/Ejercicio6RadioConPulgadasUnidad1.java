import javax.swing.*;

public class Ejercicio6RadioConPulgadasUnidad1 {
    public static void main(String[] args) {

        //declaracion de variables
        double pi = 3.1416;
        double radio = 3.2; //pulgadas
        double perimetro =0.0;
        double area =0.0;
        double diametro1 =0.0;


       perimetro= (2 *pi) * radio;

        area = pi * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El perimetro del circulo equivale a: " +  perimetro + " pulgadas");
JOptionPane.showMessageDialog(null, "El area del circulo en pulgadas es: " +  area + " pulgadas");
    }
}
