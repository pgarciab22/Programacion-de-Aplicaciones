package modelo;
/**
 * 
 * @author Patricia García Baeza 
 *
 */
public class TIsosceles implements Operaciones {
/**
 * @param alturaIsose Recibe un numero de tipo float
 * @param baseIso Recibe un numero de tipo float
 * @return Regresa el perimetro de un triangulo isosceles
 */
	public float perimetros(float ladoCu, float baseRec, float alturaRec, float ladoEqui, float baseIso,
			float alturaIsose, float baseEscaleno, float alturaEscaleno, float diametroCirc, float ladoescaleno) {
		
		return 2 * (alturaIsose) + baseIso;
	}

/**
 * @param baseTriangulo Recibe un numero de tipo float
 * @param alturaTriangulo Recibe un numero de tipo float
 * @return  Regresa el área de un triangulo isosceles
 */
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo, float baseTriangulo,
			float alturaTriangulo, float radioCirculo) {
		// TODO Auto-generated method stub
		return (baseTriangulo * alturaTriangulo)/2;
	}

}
