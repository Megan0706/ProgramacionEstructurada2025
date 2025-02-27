import javax.swing.*;

public class Ejercicio4Stereos {
    public static void main(String[] args) {
        double precioSinIva =0.0;
        String marca = " ";
        double descuento =0.0;
        double precioConDescuento =0.0;
        double iva =0.0;
        double precioFinal =0.0;
        double restaFinal =0.0;


        precioSinIva= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el precio del producto sin iva "));

        marca = JOptionPane.showInputDialog(null,"Ingresa la marca del Estereo: ");

         if (precioSinIva>=2000){
             descuento= precioSinIva *0.10;
             restaFinal= precioSinIva - descuento;
         } if (marca.equalsIgnoreCase("Nosy")){
             descuento= precioSinIva*0.05;
             restaFinal= precioSinIva-descuento;
        }
         precioConDescuento = precioSinIva - restaFinal;
         iva = precioConDescuento * 0.16;
         precioFinal= precioConDescuento + iva;

         JOptionPane.showMessageDialog(null, "El precio final con iva: " + precioFinal);


    }
}
