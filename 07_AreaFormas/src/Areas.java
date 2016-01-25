/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Areas {
/**
 * 
 * @param l  Recibe un numero de tipo float
 * @return  Retorna el área del cuadrado
 */
	public float cuadrado(float l){
	return l*l;
	}
/**
 * 
 * @param r Recibe un numero de tipo float
 * @return Regresa el área del circulo
 */
	public double circulo(double r){
		return 3.1416*(r*r);	
	}
/**
 * 
 * @param base Recibe un numero de tipo float
 * @param altura Recibe un numero de tipo de float
 * @return Regresa el área de un rectangulo
 */
	public float rectangulo (float base, float altura){
		return base*altura;	
	}
/**
 * 
 * @param i Recibe un numero de tipo float
 * @return Regresa el área de un triangulo equilatero
 */
	
	public float trianguloequi(float i){
		
		return (i*i)/2;
	}
/**
 * 
 * @param b Recibe un numero de tipo float
 * @param h Recibe un numero de tipo float
 * @return Regresa el área de un trianfulo escaleno
 */
	public float trianguloesc(float b, float h){
		
		return (b*h)/2;
	}
/**
 * 
 * @param base Recibe un numero de tipo float
 * @param altura Recibe un numero de tipo float
 * @return Regresa el área de un triangulo isosceles
 */
public float trianguloiso(float base, float altura){
		
		return (base*altura)/2;
	}
}
