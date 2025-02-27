import javax.swing.*;

public class Ejercicio5CicloFor {
    public static void main(String[] args) {

        double precioKilo=0.0;
        double total1 = 0.0;
        double kilos =0.0;
        double totalCliente=0.0;

        precioKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio por kilo de naranjas: "));


        for (int i = 1; i <= 15; i++) {
            kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos de naranjas del cliente " + i + ":"));
            totalCliente = kilos * precioKilo;
            if (kilos > 10) {
                totalCliente *= 0.85;
            }
            total1 += totalCliente;
            JOptionPane.showMessageDialog(null, "El cliente " + i + " debe pagar: " + totalCliente);
        }

        JOptionPane.showMessageDialog(null, "La tienda percibirá un total de: " + total1);
    }

}

