import javax.swing.*;

public class CiclowhileEjercicio6 {
    public static void main(String[] args) {

        int n =0; int i = 0; int edad =0;
        double sumaH = 0;
        double sumaM = 0;
        int h = 0;
        int m = 0;
        String genero = " ";
        double promedioHombres = 0.0;
        double promedioMujeres =0.0;
        double promedioTotal = 0.0;

         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

        while (i < n) {
             genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + (i + 1) + " (H/M):");
             edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + (i + 1) + ":"));
            if (genero.equalsIgnoreCase("M")) {
                sumaM += edad;
                m++;
            } else if (genero.equalsIgnoreCase("H")) {
                sumaH += edad;
               h++;
            }
            i++;
        }
        promedioHombres = sumaH / h;
        promedioMujeres = sumaM / m;
        promedioTotal = (sumaH + sumaM) / n;
        JOptionPane.showMessageDialog(null, "Promedio de edades: Hombres: "
                + promedioHombres + ", Mujeres: " + promedioMujeres +
                ", Total: " + promedioTotal);
    }
    }

