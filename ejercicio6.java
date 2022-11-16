/**6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
debemos indicarlo. */
import javax.swing.JOptionPane;
public class DivisibleApp {
public static void main(String[] args) {
String texto=JOptionPane.showInputDialog("Introduce un numero");

int numero=Integer.parseInt(texto);

if (numero%2==0){
System.out.println("El numero "+numero+" es divisible entre 2");
}else{
System.out.println("El numero "+numero+" no es divisible entre 2");
}
}
}