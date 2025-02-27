import javax.swing.*;

public class Ejercicio1Computadoras {
    public static void main(String[] args) {

                int numComputadoras = 0;
                double descuento = 0.0;
                double precioTotal = 0.0;
                double total = 0.0;

                numComputadoras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de computadoras adquiridas: "));

                if(numComputadoras<5){
                    descuento = numComputadoras * 11000.0;
                    precioTotal = descuento * 0.10;
                    total = descuento - precioTotal;

                    JOptionPane.showMessageDialog(null, "Se te ha aplicado el 10% de descuento, por lo tanto tu total es de: $" + total);
                } else if (numComputadoras>=5 && numComputadoras<10) {
                    descuento = numComputadoras * 11000.0;
                    precioTotal = descuento * 0.20;
                    total = descuento - precioTotal;
                    JOptionPane.showMessageDialog(null, "Se te ha aplicado el 20% de descuento, por lo tanto tu total es de: $" + total);
                } else if (numComputadoras>=10) {
                    descuento = numComputadoras * 11000.0;
                    precioTotal = descuento * 0.40;
                    total = descuento - precioTotal;
                    JOptionPane.showMessageDialog(null, "Se te ha aplicado el 40% de descuento, por lo tanto tu total es de: $" + total);
                }
            }
        }

