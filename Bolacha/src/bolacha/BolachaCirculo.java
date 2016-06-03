/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolacha;

/**
 *
 * @author MULTIWEB
 */
public class BolachaCirculo extends Bolacha{
    private float raio;
    
    public BolachaCirculo(int posicao, float raio) {
        super(posicao);
        this.raio = raio; 
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float areaBolacha(){
        return (float)(Math.PI * Math.pow(raio, 2));
    }    
}
 
