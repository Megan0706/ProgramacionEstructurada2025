import javax.swing.*;

public class CicloLibreEjercicio1 {
    public static void main(String[] args) {
         double presion =0.0;
         double volumen = 0.0;
        double temperatura =0.0;
        double masa =0.0;
        int n =0;
        double sumaMasa = 0;

         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos: "));

        for (int i = 0; i < n; i++) {
             presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión: "));
             volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen: "));
             temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura: "));
            masa = (presion * volumen) / (0.37 * (temperatura + 460));
            sumaMasa += masa;
        }
        double promedioMasa = sumaMasa / n;
        JOptionPane.showMessageDialog(null, "El promedio de masa es: " + promedioMasa);
    }
    }

