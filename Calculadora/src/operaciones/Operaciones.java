package operaciones;
public class Operaciones{
	
	
	/**
	 * 
	 * @param valor1 primer valor introducido
	 * @param valor2 segundo valor introducido
	 * @return devuelve el resultado dela suma
	 */
	
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * 
     * @param valor1 primer valor introducido
     * @param valor2 segundo valor introducido
     * @return devuelve el resultado dela resta
     */
    
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
        
    }
    
    /**
     * 
     * @param valor1 primer valor introducido
     * @param valor2 segundo valor introducido
     * @return devuelve el resultado dela multiplicación
     */
    
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
   /**
    * 
    * @param valor1 dividendo
    * @param valor2 divisor
    * @return devuelve el resultado de la division
    * @throws ArithmeticException contemplamos la dividión entre cero
    */
    
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
     * 
     * @param valor1 primer valor introducido
     * @param valor2 segundo valor introducido
     * @return devuelve el resultado del resto
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
    
}