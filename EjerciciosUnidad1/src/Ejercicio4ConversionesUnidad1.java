import javax.swing.*;

public class Ejercicio4ConversionesUnidad1 {
    public static void main(String[] args) {
        //Declaracion de variables

        double libras= 0.454;
        double kg =0.0;
        double conversion =0.0;
        double libra =0.0;

        kg = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Introduce la cantidad de kilogramos que" +
                                " deseas cambiar por libras: "));

        conversion = 1/ libras;

        libra = kg * conversion;

        JOptionPane.showMessageDialog(null,"La conversion de los " + kg + " kilos añadidos equivale a: " + libra + " libras ");

    }
}
