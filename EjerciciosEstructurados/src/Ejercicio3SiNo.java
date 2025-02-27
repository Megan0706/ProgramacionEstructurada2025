import javax.swing.*;

public class Ejercicio3SiNo {
    public static void main(String[] args) {
        ;
                int resp1;
                int resp2;
                int resp3;

                resp1 = Integer.parseInt(JOptionPane.showInputDialog("¿Colón descubrió América? \n1.Sí \n2.No \n Escoja el número de su respuesta:"));
                if (resp1 == 1){
                    resp2 = Integer.parseInt(JOptionPane.showInputDialog("¿La Independencia de México fue en el año 1810? \n1.Sí \n2.No \n Escoja el número de su respuesta:"));
                    if (resp2 == 1){
                        resp3 = Integer.parseInt(JOptionPane.showInputDialog("¿The Doors fue un grupo de rock Americano? \n1.Sí \n2.No \n Escoja el número de su respuesta:"));
                        if (resp3 == 1){
                            JOptionPane.showMessageDialog(null, "Ganaste el juego.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, perdiste.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta, perdiste.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, perdiste.");
                }
            }
        }


