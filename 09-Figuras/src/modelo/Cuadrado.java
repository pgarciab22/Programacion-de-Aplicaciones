package modelo;
/**
 * 
 * @author Patricia Garc�a Baeza
 *
 */
public class Cuadrado implements Operaciones {
/**
 * @param ladocu Recibe un numero de tipo float
 * @return Regresa el perimetro de un cuadrado
 */
	public float perimetros(float ladoCu, float baseRec, float alturaRec, float ladoEqui, float baseIso,
			float alturaIsose, float baseEscaleno, float alturaEscaleno, float diametroCirc,float ladoescaleno) {
		return ladoCu + ladoCu + ladoCu + ladoCu;
	}
/**
 * @param ladocuadrado Recibe un numero de tipo float
 * @return Regresa el �rea de un cuadrado
 */
	
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo, float baseTriangulo,
			float alturaTriangulo, float radioCirculo) {
		
		return ladoCuadrado * ladoCuadrado;
	}

}
