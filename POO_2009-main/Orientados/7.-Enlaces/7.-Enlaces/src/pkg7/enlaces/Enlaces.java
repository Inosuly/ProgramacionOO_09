/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.enlaces;

/**
 *
 * @author ruben
 */
public class Enlaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona obj = new Trabajador();
        
    /* La referencia es de la clase Persona y el objeto es de tipo *Persona*/
       Persona obj2 = new Persona();  
       obj.camina();
       obj2.camina(); 
       }
    
}