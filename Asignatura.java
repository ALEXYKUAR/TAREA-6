/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author alexm
 */
public class Asignatura {
    //atributo
     private String nombre;
     
     private String codigo;
     
     private int periodo;
     
     public Asignatura(){
         
     }
    
     public void establecerNombre(String nombre) {
       this.nombre = nombre;  
     }
     public String obtenerNombre(){
         return this.nombre;
     }
     
     
     public void establecerCodigo(String codigo) {
       this.codigo = codigo;  
     }
     public String obtenerCodigo(){
         return this.codigo;
     }
     
     public void imprimirInformacion(){
         System.out.println("Nombre:" + nombre);
         System.out.println("COdigo:" + codigo);
     }
     
     
}
