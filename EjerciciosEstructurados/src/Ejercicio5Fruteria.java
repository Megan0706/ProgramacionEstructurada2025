import javax.swing.*;

public class Ejercicio5Fruteria {
    public static void main(String[] args) {
        double kilos = 0;
        double descuento = 0.0;
        double precioKilo = 0.0;
         double subtotal = 0.0;
         double descuentoTotal=0.0;
         double total =0.0;

        kilos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los kilos que vas a comprar: "));
        precioKilo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce cuanto vale el kilo de manzanas: "));


        if (kilos == 0 && kilos <= 2) {
            descuento = 0;
        } else if (kilos >= 2 && kilos <= 5) {
            descuento = 0.10;
        } else if (kilos >= 5 && kilos <= 10) {
            descuento = 0.15;
        } else {
            descuento=0.20;

        }
        subtotal= kilos * precioKilo;
        descuentoTotal= subtotal * descuento;
        total = subtotal - descuentoTotal;

        JOptionPane.showMessageDialog(null,"El subtotal equivale a: " + subtotal + "\nEl descuento seria: " +  (descuento* precioKilo) + "\nEl total a pagar es: " + total );


    }
    }


