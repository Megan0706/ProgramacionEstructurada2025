import javax.swing.*;

public class CiclowhileEjercicio1 {
    public static void main(String[] args) {

        int n = 0;
        int i = 0;
        double sueldoBase = 0.0;
        double v1 = 0.0, v2, v3;
        double comision = 0.0;
        double sueldoTotal = 0.0;
        double descuento = 0.10;


        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        i = 0;
        while (i < n) {
            sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + (i + 1) + ":"));
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la primera venta:"));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la segunda venta:"));
            v3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tercera venta:"));
            comision = (v1 + v2 + v3) * descuento;
            sueldoTotal = sueldoBase + comision;
            JOptionPane.showMessageDialog(null, "El vendedor; " + (i + 1) + " obtendrá; " + comision + " por comisiones y: " + sueldoTotal + " en total.");
            i++;
        }
    }
}


