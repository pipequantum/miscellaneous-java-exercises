/**5) Haz una aplicación que calcule el área de un cuadrado (pi*R2). El radio se pedirá por teclado
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método
pow de Math. */
import javax.swing.JOptionPane;
public class AreaCirculoApp {
public static void main(String[] args) {
String texto=JOptionPane.showInputDialog("Introduce un radio");
double radio=Double.parseDouble(texto);
double area=Math.PI*Math.pow(radio, 2);
System.out.println("El area del circulo es "+area);