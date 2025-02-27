import javax.swing.*;

public class Ejercicio9AreaTrinaguloUnidad1 {
    public static void main(String[] args) {

        double base =0.0;
        double altura= 0.0;
        double multiplicacion =0.0;
        double area =0.0;


        base= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base del Triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Itroduce la altura del triangulo"));

        multiplicacion = base * altura ;
        area = multiplicacion/2;

        JOptionPane.showMessageDialog(null, "el area del triangulo es: " +  area);
    }
}
