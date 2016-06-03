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
public class BolachaRetangulo extends Bolacha{
    private float base;
    private float altura;

    public BolachaRetangulo(int posicao, int base, int altura) {
        super(posicao);
        this.base = base;
        this.altura = altura;        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float areaBolacha(){
        return base*altura;
    }   
}
