package menu;
import java.util.Scanner;
public class Menu {
	
	
	/**
	 * 
	 */
	
	
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * 
     * @return devuelve un array con los valores introducidos por el usuario
     */
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * 
     * @return devuelve un string con la operaci�n seleccionada
     */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * 
     * @return devuelve la decisi�n del usuario al preguntar si quiere seguir utilizando el programa
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
        
    }
}