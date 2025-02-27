import javax.swing.*;

public class Ejercicio93Numeros {
    public static void main(String[] args) {


                int numero1=0, numero2=0, numero3=0;
                int mitad;


                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));


                if ((numero1 > numero2 && numero1 < numero3) || (numero1 < numero2 && numero1 > numero3)) {
                    mitad = numero1;
                } else if ((numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3)) {
                    mitad = numero2;
                } else {
                   mitad = numero3;
                }


                JOptionPane.showMessageDialog(null, "El número medio es: " + mitad);
            }
        }

