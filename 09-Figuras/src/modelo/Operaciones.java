package modelo;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public interface Operaciones {
/**
 * 
 * @param ladoCu Recibe un numero de tipo float que representa el lado de un cuadrado
 * @param baseRec Recibe un numero de tipo float que representa la base de un rectangulo
 * @param alturaRec Recibe un numero de tipo float que representa la altura de un rectangulo
 * @param ladoEqui Recibe un numero de tipo float que representa la medida de un lado de un triangulo equilatero
 * @param baseIso Recibe un numero de tipo float que representa la medida de la base de un triangulo Isosceles
 * @param alturaIsose Recibe un numero de tipo float que representa la medida de la altura de un triagulo isosceles
 * @param baseEscaleno Recibe  un numero de tipo float que representa la medida de la base de un triangulo escaleno
 * @param alturaEscaleno Recibe un numero de tipo float que representa la medida de la altura de un triangulo escaleno
 * @param diametroCirc Recibe un numero de tipo float que representa la medida del diametro de un circulo
 * @param ladoescaleno Recibr un numero de tipo float que representa la medida de un lado de un triangulo escaleno
 * @return Regresa  los perimetros de las figuras geometricas (rectangulo,circulo,cuadrado y triangulos)
 */
	public float perimetros(float ladoCu,float baseRec, float alturaRec, float ladoEqui, float baseIso, float alturaIsose, float baseEscaleno, float alturaEscaleno,float diametroCirc, float ladoescaleno);
/**
 * 
 * @param ladoCuadrado Recibe un numero de tipo float que representa el lado de un cuadrado
 * @param baseRectangulo Recibe un numero de tipo float que representa el tamaño de la base de un rectangulo
 * @param alturaRectangulo Recibe un numero de tipo float que representa el tamaño de la altura de un rectangulo
 * @param baseTriangulo Recibe un numero de tipo float que representa la medida de la base de un triangulo
 * @param alturaTriangulo Recibe un numero de tipo float que representa la medida de la altura de un triangulo
 * @param radioCirculo Recibe un numro de tipo float que representa el tamaño del radio de un circulo
 * @return Regresa el área de las figuras geometricas (rectangulo, circulo, cuadrado y triangulos)
 */
	public float areas(float ladoCuadrado, float baseRectangulo, float alturaRectangulo,float baseTriangulo, float alturaTriangulo, float radioCirculo);
	
}
