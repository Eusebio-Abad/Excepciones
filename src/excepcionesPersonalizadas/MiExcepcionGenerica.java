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
public class MiExcepcionGenerica extends Exception {
    
    private final static String MENSSAGE = ""
            + "Esto es una excepcion general y no sabemos las causa" ;
            
    
    public MiExcepcionGenerica(){
        
        super(MENSSAGE);
        
    }      
}