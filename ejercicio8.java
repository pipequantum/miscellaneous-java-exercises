/**8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y
muestre su código en la tabla ASCII. */
import javax.swing.JOptionPane;
public class CaracterASCIIApp {
public static void main(String[] args) {
String texto=JOptionPane.showInputDialog("Introduce un caracter
ASCII");

char caracter=texto.charAt(0);

int codigo=(int)caracter;
System.out.println(codigo);
}
}