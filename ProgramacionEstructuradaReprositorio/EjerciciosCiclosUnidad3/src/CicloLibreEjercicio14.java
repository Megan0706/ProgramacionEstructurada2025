import javax.swing.*;

public class CicloLibreEjercicio14 {
    public static void main(String[] args) {

                double s=0.0;
                double x =0.0;
                int n =0;
                double demo=0.0;
                double denoSup =0.0;
                double supDeno=0.0;

                n =Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de fracciones a resolver"));

                int i=1;
                denoSup=1.0;
                demo=1.0;

                while (i<=n){
                    x =Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

                    if(i%2!=0) {
                        s+=Math.pow(x,3.0/supDeno)/demo;
                    }else {
                        s-=Math.pow(x,3.0/supDeno)/demo;
                    }
                    supDeno+=3;
                    demo += 2;
                    i++;
                }
                JOptionPane.showMessageDialog(null, "El resultado es: " +s);
            }
        }
        
