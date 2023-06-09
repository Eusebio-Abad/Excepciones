/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Eusebio
 */
public class MiExcepcionNumerica extends Exception {
    
    private final static String MENSSAGE = ""
            +" Error de conversion numerica"
            +"Ingrese un texto que contenga un numero";
    
    public MiExcepcionNumerica(){
        
        super(MENSSAGE);
    }   
    
}
