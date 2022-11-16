/**9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
el precio final con IVA. El IVA sera una constante que sera del 21%. */
import javax.swing.JOptionPane;
public class PrecioProductoApp {
public static void main(String[] args) {

final double IVA=0.21;
String texto=JOptionPane.showInputDialog("Introduce el precio de
un producto");

double precio=Double.parseDouble(texto);

double precioFinal=precio+(precio*IVA);
System.out.println(precioFinal);
}
}