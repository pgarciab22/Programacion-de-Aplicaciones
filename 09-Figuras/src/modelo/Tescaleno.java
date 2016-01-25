package modelo;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Tescaleno implements Operaciones {
	
/**
 * @param baseEscaleno Recibe un numero de tipo float
 * @param alturaEscaleno Recibe un numero de tipo float
 * @param ladoescaleno Recibe un numero de tipo float
 * @return Regresa el perimetro de un triangulo escaleno
 */
	public float perimetros(float ladoCu, float baseRec, float alturaRec, float ladoEqui, float baseIso,
			float alturaIsose, float baseEscaleno, float alturaEscaleno, float diametroCirc, float ladoescaleno) {
		
		return baseEscaleno + alturaEscaleno + ladoescaleno;
	}

/**
 *@param baseTriangulo  Recibe un numero de tipo float
 *@param alturaTriangulo Recibe un numero de tipo float
 *@return Regresa el área de un triangulo escaleno
 */
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo, float baseTriangulo,
			float alturaTriangulo, float radioCirculo) {
		
		return (baseTriangulo * alturaTriangulo)/2;
	}

}
