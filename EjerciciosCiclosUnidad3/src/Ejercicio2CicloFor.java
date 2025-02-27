import javax.swing.*;

public class Ejercicio2CicloFor {
    public static void main(String[] args) {
        int alumnos =0;
        double suma =0.0;
        double caliMinima =100;
        double calificacion =0.0;
        double promedio =0.0;





         alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

        for (int i = 0; i < alumnos; i++) {
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            if (calificacion < caliMinima) {
                caliMinima = calificacion;
            }
        }
        promedio = suma / alumnos;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio + "\nLa calificación más baja es: " + caliMinima);
    }
    }

