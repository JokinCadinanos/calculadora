package principal;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;

/**
 * 
 * @author Jokin Cadiñanos
 *
 */

public class Calculadora{
    private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());

    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        
        Handler fileHandler  = null;
        Handler cosoleHandler = new ConsoleHandler();
        
        try {
        	fileHandler = new FileHandler("./logs/operaciones.log");
        }catch (IOException e) {
        	
        }
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            try {
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operación no válida");
            }
        }catch (ArithmeticException e) {
        	System.out.println("Operaciones aritmeticas no validas " + e.getMessage());
        	
        }
            
        }   while (menu.repetir());
    }
}