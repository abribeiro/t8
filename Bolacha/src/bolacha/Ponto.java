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
public class Ponto {
   private float x, y;
  
   public Ponto(){
        x = 0;
        y = 0;
   }
   
   public Ponto (float x, float y){
        this.x = x;
        this.y = y;
   } 
  
   public void setPont(float a, float b){
        x = a;
        y = b;
   }
   
   public void moverPonto(float dx, float dy){
        x = x+dx;
        y = y+dy;
   }
   
   public void mostrarPonto(){
       System.out.println("x= "+x+" y= "+ y);
   }
   
   public float getx(){
       return x;
   }
   public float gety(){
       return y;
   }
   
}
