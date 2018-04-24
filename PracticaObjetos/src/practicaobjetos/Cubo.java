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
public class Cubo extends Cuadrado {
    
     public Cubo(double lado){
        super();
    }

    Cubo() {
    }
    
    public double calcularVolumen(){
        return (int)Math.pow(lado,3);
    }
    
    @Override
    public double calcularPerimetro(){
        return lado*12;
    }
}
