import javax.swing.*;

public class Ejercicio7AnalisisClinicos {
    public static void main(String[] args) {
        int edad =0;
        double hemoglobina =0.0;
        int sexo = 0;

        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad: "));
        hemoglobina= Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce tus niveles de hemoglobina: "));;
        sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el sexo de la persona (1 si es hombre, 2 si es mujer) "));

         String resultado = "La persona no tiene anemia";

         if (edad<1) {
             if (hemoglobina < 13) resultado = "La persona tiene anemia";
         } else if (edad<6) {
             if (hemoglobina < 10) resultado = "La persona tiene anemia";
         } else if (edad<=12) {
             if (hemoglobina<11)  resultado = "La persona tiene anemia";
         } else if (edad <= 5) {
             if (hemoglobina < 11.5) resultado = "La persona tiene anemia.";
         } else if (edad <= 10) {
             if (hemoglobina < 12.6) resultado = "La persona tiene anemia.";
         } else if (edad <= 15) {
             if (hemoglobina < 13) resultado = "La persona tiene anemia.";
         } else if (edad > 15 && sexo == 2) {
             if (hemoglobina < 12) resultado = "La persona tiene anemia.";
         } else if (edad > 15 && sexo == 1) {
             if (hemoglobina < 14) resultado = "La persona tiene anemia.";
         }
         JOptionPane.showMessageDialog(null,resultado);

    }
    }


