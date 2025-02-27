import javax.swing.*;

public class Ejercicio12SegundosUnidad1 {
    public static void main(String[] args) {
        double segundos = 0.0;
        double horas =0.0;
        double conversion =0.0;

        segundos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de segundos que quieres convertir: "));

        conversion = segundos / 60;

        JOptionPane.showMessageDialog(null, segundos + " segundos equivalen a: " + conversion + " minutos");
    }
}
