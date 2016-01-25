package modelo;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Rectangulo implements Operaciones {
/**
 * @param baseRec Recibe un numero de tipo float
 * @param alturaRec Recibe un numero de tipo float
 * @return Regresa el perimetro de un rectangulo
 */
	
	public float perimetros(float ladoCu, float baseRec, float alturaRec, float ladoEqui, float baseIso,
			float alturaIsose, float baseEscaleno, float alturaEscaleno, float diametroCirc,float ladoescaleno) {
		
		return 2*(baseRec + alturaRec);
	}

/**
 * @param baseRectangulo Recibe un numero de tipo float
 * @param alturaRectangulo Recibe un numero de tipo float
 * @return Regresa el área de un rectangulo
 */
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo, float baseTriangulo,
			float alturaTriangulo, float radioCirculo) {
		
		return baseRectangulo * alturaRectangulo;
	}

}
