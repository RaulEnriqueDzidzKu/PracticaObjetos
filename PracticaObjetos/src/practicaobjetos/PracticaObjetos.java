/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

import java.util.Scanner;

/**
 *
 * @author raul_
 */
public class PracticaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner vlado = new Scanner(System.in);
        //Variables
        double longitud;
        int op, op1;
        boolean menu = false;
        
        //Valor que ingresa el usuario
        System.out.println("INTRODUCE LA LONGITUD DE UN LADO");
        longitud = vlado.nextInt();
        //Instancia de clase Cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(longitud);
        //Instanciar clase Cubo
        Cubo cubo1 = new Cubo();
        cubo1.setLado(longitud);
        do {
        //Opciones
        System.out.println("Elige la opcion con la oprecion que deseas realizar: \n 1.-Área de Cuadrado \n 2.- Perimetro de Cuadrado \n3.- Volumen de Cubo \n4.-Perimetro de Cubo \n5.- Cancelar \n6.-Salir");
        op = vlado.nextInt();
        
            //Switch Case
            switch(op){
                case 1:
                    System.out.println("El área de cuadrado es: " + cuadrado1.calcularArea());
                    break;
                case 2: 
                    System.out.println("El perimetro del cuadrado es: " +cuadrado1.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("El volumen de cubo es: " +cubo1.calcularVolumen());
                    break;
                case 4:
                    System.out.println("El perimetro del cubo es: " +cubo1.calcularPerimetro());
                    break;
                case 5:
                    PracticaObjetos.main(null);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                   System.out.println("Elije una de las opciones entre 1 y 6");
            }
            
            System.out.println("ELIJE UNA OPCIÓN: \n1:Menú de Calculos(Misma longitud) \n2:Ingresar nueva longitud");
            op1 = vlado.nextInt();
            
            if(op1 == 1){
                menu = true;
            }
            if(op1 == 2){
                PracticaObjetos.main(null);
            }
        } while(menu = true);
    
    
    }
    
}
