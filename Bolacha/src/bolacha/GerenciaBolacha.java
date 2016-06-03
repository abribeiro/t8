/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolacha;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author MULTIWEB
 */
public class GerenciaBolacha {
    
  
    static BolachaTriangulo criaBolachaTriangulo(int posicao){
        Random rd = new Random();
        int base, altura;
        do{
            base = rd.nextInt(10);
            altura = rd.nextInt(10);
        }while(base == 0 || altura == 0);
        BolachaTriangulo b = new BolachaTriangulo(posicao, base, altura);        
        return b;               
    }
    
    static BolachaRetangulo criaBolachaRetangulo(int posicao){
        Random rd = new Random();
            int base, altura;
            do{
                base = rd.nextInt(10);
                altura = rd.nextInt(10);
            }while(base == 0 || altura == 0);
            BolachaRetangulo b = new BolachaRetangulo(posicao, base, altura);  
            return b;
    }
    
    static BolachaCirculo criaBolachaCirculo(int posicao){
        Random rd = new Random();
            int raio;
            do{
                raio = rd.nextInt();
            }while(raio == 0);
            BolachaCirculo b = new BolachaCirculo(posicao, raio);
            return b;            
    }
}
