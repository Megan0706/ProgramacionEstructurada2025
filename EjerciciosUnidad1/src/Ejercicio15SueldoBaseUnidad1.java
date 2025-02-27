import javax.swing.*;

public class Ejercicio15SueldoBaseUnidad1 {
    public static void main(String[] args) {
        double sueldoBase = 0.0;
        double comision = 0.0, comision2=0.0, comision3=0.0;
        double venta1 =0.0, venta2=0.0, venta3=0.0;
        double totalComi = 0.0;
        double totalMensual =0.0;

        sueldoBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Introudce el sueldo base: "));

        venta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de la primera venta: "));
        venta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de la segunda venta: "));
        venta3= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de la tercera venta: "));

        comision = venta1*0.10;
        comision2 = venta2*0.10;
        comision3 = venta3*0.10;

        totalComi = comision + comision2 + comision3;
        totalMensual = sueldoBase + totalComi;

        JOptionPane.showMessageDialog(null, "El sueldo base es: " + sueldoBase
        + "\n La comision de la primera venta es: " + comision + "\nLa comision de la segunda venta es: " + comision2 +
                "\nLa comision de la tercera venta es: " + comision3 + "\nEl total de comisiones son: " +  totalComi +
                "\nEl total a recibir en el mes: " + totalMensual);
    }
}
