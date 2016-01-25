package modelo;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Circulo implements Operaciones {

/**
 * @parama diametroCirc Recibe un numero de tipo float
 * @return Regresa el perimetro de un circulo
 * 
 *
 */

	public float perimetros(float ladoCu, float baseRec, float alturaRec, float ladoEqui, float baseIso,
			float alturaIsose, float baseEscaleno, float alturaEscaleno, float diametroCirc,float ladoescaleno) {
		
		return (float) (3.14 * diametroCirc);
	}

/**
 * @param radioCirculo Recibe un  numero de tipo float
 * @return Regresa el área de un circulo
 */
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo, float baseTriangulo,
			float alturaTriangulo, float radioCirculo) {
		
		return (float) (3.14 *(radioCirculo * radioCirculo));
	}

}
