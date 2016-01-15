import javax.swing.JOptionPane;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Saludo {
	/**
	 * 
	 * @param Metodo main que recibe una cadena de caracteres, nombre y edad
	 */
	public static void main(String[] args) {
		
		String nombre="Paty";
		String edad="22";
		System.out.println("Hola: " + nombre);
		System.out.printf("Hola: %s",nombre); //%s para concatenar
		JOptionPane.showInternalMessageDialog(null, String.format("Hola: %s tu edad.", nombre,edad));
	}

}
