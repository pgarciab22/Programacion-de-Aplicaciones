/**
 * 
 * @author Patricia García Baeza
 *
 */

public class Alumno {
	
	private String nombre;
	private String edad;
	private String telefono;
	private String Direccion;
	private String sexo;
	private String estatura;
	private String peso;
	private String curp;
	private String rfc;
	private String estadocivil;
	
	/**
	 * 
	 * @param nombre  El nombre del alumno en formato String
	 * @param edad    La edad del alumno en formato String
	 * @param telefono El telefono del alumno en formato String
	 * @param direccion La direccion del alumno en formato String
	 * @param sexo 		El sexo del alumno en formato String
	 * @param estatura  La estatura del alumno en formato String
	 * @param peso		El peso del alumno en formato String
	 * @param curp		El curp del alumno en formato String
	 * @param rfc		El RFC del alumno en formato String
	 * @param estadocivil  El estado civil del alumno en formato String
	 */
	public Alumno(String nombre, String edad, String telefono, String direccion, String sexo, String estatura,
			String peso, String curp, String rfc, String estadocivil) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		Direccion = direccion;
		this.sexo = sexo;
		this.estatura = estatura;
		this.peso = peso;
		this.curp = curp;
		this.rfc = rfc;
		this.estadocivil = estadocivil;
		
	/**
	 * Constructor con parametros
	 */
	}
	

	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Introduce el nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return Regresa el nombre de la persona
	 */
	public String getEdad() {
		return edad;

	}
	/**
	 * 
	 * @param edad Introduce la edad del alumno
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return Regresa la edad del alumno
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono Introduce el telefono del alumno
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return Regresa el telefono del alumno
	 */
	public String getDireccion() {
		return Direccion;
	}
	/**
	 * 
	 * @param direccion Introduce la direccion del alumno
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	/**
	 * 
	 * @return Regresa la direccion del alumno
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * 
	 * @param sexo Introduce el sexo del alumno
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * 
	 * @return Regresa el sexo del alumno
	 */
	public String getEstatura() {
		return estatura;
	}
	
/**
 * 
 * @param estatura Introduce la estatura del alumno
 */
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	
	/**
	 * 
	 * @return Regresa la estatura del alumno
	 */
	public String getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso Introduce el peso del alumno
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
	/**
	 * 
	 * @return Regresa el peso del alumno
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * 
	 * @param curp Introduce el CURP del alumno
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * 
	 * @return Regresa el CURP del alumno
	 */
	public String getRfc() {
		return rfc;
	}
	/**
	 * 
	 * @param rfc Introduce el RFC del alumno
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	/**
	 * 
	 * @return Regresa el RFC del alumno
	 */
	public String getEstadocivil() {
		return estadocivil;
	}
	/**
	 * 
	 * @param estadocivil Introduce el estado civil del alumno
	 */
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}	
}
