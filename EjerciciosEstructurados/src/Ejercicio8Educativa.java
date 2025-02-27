import javax.swing.*;

public class Ejercicio8Educativa {
    public static void main(String[] args) {

                double promedio, totalPagar;
                int numeroReprobadas, unidades;
                String tipoEstudio;


                promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));
                numeroReprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de materias reprobadas del alumno:"));
                tipoEstudio = JOptionPane.showInputDialog("Ingrese el tipo de estudio (preparatoria o profesional):");


                if (tipoEstudio.equals("preparatoria")) {
                    if (promedio >= 9.5) {
                        unidades = 55;
                        totalPagar = unidades * 180 / 5 * 0.75;
                    } else if (promedio >= 9) {
                        unidades = 50;
                        totalPagar = unidades * 180 / 5 * 0.90;
                    } else if (promedio > 7) {
                        unidades = 50;
                        totalPagar = unidades * 180 / 5;
                    } else if (promedio <= 7 && numeroReprobadas <= 3) {
                        unidades = 45;
                        totalPagar = unidades * 180 / 5;
                    } else {
                        unidades = 40;
                        totalPagar = unidades * 180 / 5;
                    }
                } else if (tipoEstudio.equals("profesional")) {
                    if (promedio >= 9.5) {
                        unidades = 55;
                        totalPagar = unidades * 300 / 5 * 0.80;
                    } else {
                        unidades = 55;
                        totalPagar = unidades * 300 / 5;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de estudio no válido.");
                    return;
                }

                // Mostrar el total a pagar
                JOptionPane.showMessageDialog(null, "El total a pagar es: $" + totalPagar);
            }
        }



