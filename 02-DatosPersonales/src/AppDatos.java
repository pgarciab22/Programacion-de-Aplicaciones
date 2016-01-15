import javax.swing.JOptionPane;
/**
 * 
 * @author Patricia García Baeza
 *
 */

public class AppDatos {
	
	/**
	 * 
	 * @param metodo principal que recibe todos los datos ingresados en la clase alumno
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno al = new Alumno("Paty","22", "5531170712","Tecamac","Femenino","1.45","44","sdfd","asderr","Soltera");
		
		JOptionPane.showMessageDialog(null,
				String.format("Hola %s \n tu edad es %s y \ntu telefono, y \ntu direccion, y \ntu sexo,y \ntu estatura,y \ntu peso, y \ntu curp, y \ntu rfc, y \ntu estado civil", al.getNombre(),al.getEdad(), al.getTelefono(), al.getDireccion(), al.getSexo(),al.getEstatura(),al.getPeso(),al.getCurp(),al.getRfc(),al.getEstadocivil()));
	}

}
