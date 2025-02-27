import javax.swing.*;

public class CiclowhileEjercicio5 {
    public static void main(String[] args) {
        int n =0; int i = 0;
        double suma =0.0;
        double calificacion=0.0;
        double promedio = 0.0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos: "));

        while (i < n) {
           calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) ));
            suma += calificacion;
            i++;
        }
        promedio = suma / n;
        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es " + promedio);
    }
    }

