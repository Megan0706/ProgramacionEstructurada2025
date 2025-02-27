import javax.swing.*;

public class Ejercicio5ConversionesUnidad1 {
    public static void main(String[] args) {

        double pulgadas = 25.4;
        double mili =0.0;
        double pulgada =0.0;
        double conversion=0.0;

        pulgada= Integer.parseInt(JOptionPane.showInputDialog("Introduce las pulgadas que deseas cambiar: "));

        conversion = pulgada * pulgadas;

        JOptionPane.showMessageDialog(null, "Las conversion de las "
                + pulgada + " pulgadas "
                +  " equivalen a: " + conversion + " milimetros" );


    }
}
