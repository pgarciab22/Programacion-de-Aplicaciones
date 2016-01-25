/**
 * 
 * @author Patricia García Baeza
 *
 */
public class Perimetros {
/**
 * 
 * @param lado Recibe un numero de tipo float
 * @return Regresa la suma de 4 numeros (perimetro del cuadrado)
 */
  public float cuadrado(float lado){
	  return lado + lado + lado + lado;
  }
  /**
   * 
   * @param base recibe un numero de tipo float
   * @param altura recibe un numero de tipo float
   * @return regresa el perimetero del rectangulo
   */
  public float rectangulo(float base, float altura){
	  return 2 * (base + altura);
  }
  /**
   * 
   * @param diametro recibe un numero de tipo float
   * @return regresa el perimetro del circulo
   */
  public double circulo(double diametro){
	  return Math.PI* diametro;
  }
  /**
   * 
   * @param ladoequi recibe un numero de tipo float
   * @return regresa el perimetro de un triangulo equilatero
   */
  public float equilatero (float ladoequi){
	  return 3*(ladoequi);
	  
  }
  /**
   * 
   * @param base Recibe un numero de tipo float
   * @param lado Recibe un numero de tipo float
   * @return Regresa el perimetro de un triangulo Isosceles
   */
  
  public float isoseles (float base , float lado){
	  return 2*(lado) + base;
  }
  /**
   * 
   * @param lado1 Recibe un nunmero de tipo float
   * @param lado2 Recibe un numero de tipo float
   * @param lado3 Recibe un numero de tipo float
   * @return
   */
  public float escaleno(float lado1, float lado2, float lado3){
	  return lado1 + lado2 + lado3;
  }
}
