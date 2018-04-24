/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

/**
 *
 * @author raul_
 */
public class Cuadrado {
    double lado;
  
    //Constructor
    Cuadrado(){
        
    }
    
    //Establecer la longitud del lado 
    public void setLado(double l){
        lado = l;
    }
    
    //Se retorna el valor del lado
    public double getlado(){
        return lado;
    }
    
    //Metodo de la operacion
    public double calcularArea(){
        return (int) Math.pow(lado, 2);
    }
    
    public double calcularPerimetro(){
        return lado * 4;
    }
}
