import javax.swing.*;

public class Ejercicio6CicloFor {
    public static void main(String[] args) {

        double suma = 0.0;
        double contaminacionMinima = 100;
        double contaminacionMaxima = 0.0;
        double p=0.0;

        for (int i = 1; i <= 25; i++) {
            p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil " + i ));
            suma += p;
            if (p <  contaminacionMinima) {
                contaminacionMinima = p;
            } if (p > contaminacionMaxima) {
                contaminacionMaxima = p;
            }
        }

        double promedio = suma / 25;
        JOptionPane.showMessageDialog(null,
                "Promedio de puntos de contaminantes: " + promedio +
                        "\nMenor contaminación: " + contaminacionMinima +
                        "\nMayor contaminación: " + contaminacionMaxima);
    }

}

