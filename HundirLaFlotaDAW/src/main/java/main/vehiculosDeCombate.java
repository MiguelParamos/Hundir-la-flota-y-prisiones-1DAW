/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jose
 */
public class vehiculosDeCombate extends elementoConNombre{
    
    private casillaBarco[] posiciones;
    private char estado;
    private char simbolo;
    
    public vehiculoDeCombate(byte[][] p, string n, char s){
    super(n);
    this.posiciones = p;
    this.simbolo = s;
   
    }
    public recibirDisparos(int x, int y){
          
            this.posx = x;
            this.posy= y;
            
}
public char getEstado(){
return this.estado;
}
public char getSimbolo(){
    
    return this.simbolo;
}
public byte[] getPosiciones(){
return this.posiciones;

}

}
