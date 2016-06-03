/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolacha;
import java.util.ArrayList;

/**
 *
 * @author MULTIWEB
 */
public class Bolachas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
 
        ArrayList<Bolacha> listaBolachas =  new ArrayList<>();
        
        //Cria lista de bolachas aletorias
        for(int i=1; i<=50; i++){
            if(i<=16){
                float areaBolachaC;
                BolachaCirculo b = GerenciaBolacha.criaBolachaCirculo(i);
                listaBolachas.add(b);
                areaBolachaC= b.areaBolacha();
               
                System.out.println("Bolacha Cirulo = " + b);
                System.out.println ("Area Circulo =" + areaBolachaC); 
            }else if(i>16 && i <=32){
                float areaBolachaT;
                BolachaTriangulo b = GerenciaBolacha.criaBolachaTriangulo(i);
                areaBolachaT = b.areaBolacha();
                listaBolachas.add(b);
                System.out.println("Bolacha Triangulo = " + b ); 
                System.out.println ("Area Triangulo =" + areaBolachaT); 

            } else{
                float areaBolachaR;
                BolachaRetangulo b = GerenciaBolacha.criaBolachaRetangulo(i);
                areaBolachaR= b.areaBolacha();
                listaBolachas.add(b);
                System.out.println("Bolacha retangulo = " + b);
                System.out.println ("Area Retangulo =" + areaBolachaR); 
            }                
        } 
        
                   
    }

 
    
}
 
    

