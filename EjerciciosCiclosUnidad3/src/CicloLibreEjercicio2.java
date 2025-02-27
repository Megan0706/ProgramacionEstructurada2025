import javax.swing.*;

public class CicloLibreEjercicio2 {
    public static void main(String[] args) {
        double calidad =0.0;
        int i=0;
        int kilo = 0;
        double peso = 0.0;
        double altura =0.0;
        int n=0;
      int huevos =0;
        double sumaCalidad =0.0;

         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de gallinas:"));

        for ( i = 1; i < n; i++) {
             peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina: " +i));
             altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina: "));
             huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos: "));
            calidad = (peso * altura) / huevos;
            sumaCalidad += calidad;
        }
        double promedioCalidad = sumaCalidad / n;
        double precio;
        if (promedioCalidad >= 15) {
            precio = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8) {
            precio = 1.0 * promedioCalidad;
        } else {
            precio = 0.8 * promedioCalidad;
        }
        JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: " + precio);
    }
    }

