/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Eusebio
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        try {
            String valorNumerico = "16";
        int numero = Utilitario.convertir(valorNumerico);
        System.out.println("El numero es:" + numero);
        
        } catch (MiExcepcionNumerica e){ 
            
            System.err.println(e.getLocalizedMessage());
            
        } catch (MiExcepcionGenerica e){     
            
             System.err.println(e.getLocalizedMessage());
        }
        
        
    }
    
}
