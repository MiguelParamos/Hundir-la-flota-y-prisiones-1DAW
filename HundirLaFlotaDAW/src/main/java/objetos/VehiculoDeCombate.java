/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *Clase que ejecuta VehiculoDeCombate que estiende a ElementoConNombre
 * completa a barco y avión.
 * @author Jose Martín
 */
public class VehiculoDeCombate extends ElementoConNombre {
    //VehiculoDe combate se estiende a ElementoConNombre
    private CasillaBarco[] posiciones;//Array que indica en que casilla se encuentra el barco
    private char estado;//Carácter de estado que pueden ser 3 tocado 't', hundido 'h' o normal 'n'.
    private char simbolo;//Caracter de simbolo que puede ser barco o avión
    /**
     * Constructor de VehiculosDeCombate con todos 
     * los datos 
     * @param n nombre  de ElementoConNombre
     */

    public VehiculoDeCombate(CasillaBarco[] p, String n, char s) {
        super(n);
        setPosiciones(p);//Posición
        setSimbolo(s);//Simbolo
        setEstado('n');//Estado
    }
    /**
     * Descripción metodo recibirDisparo: Se utiliza para indicar si un barco o un avión le ha disparado a una casilla.
     * @param posición eje x
     * @param posición eje y 
     * @return boolean que indica si el disparo le ha dado al barco
     */
    public boolean recibirDisparo(byte x, byte y) {
        
        for (int i = 0; i < posiciones.length; i++) {
            
            if(posiciones[i].recibirDisparo(x, y)){
                estado='h';
                for (int j = 0; j < posiciones.length; j++) {
                    if(!posiciones[i].isTocado()){
                        estado='t';
                    }
                }
                return true;
            }
            
        }
       return false;
    }
    
    /**
     * Getter de estado
     * @return devuelve el estado del barco o del avión
     */
    
    public char getEstado() {
        return this.estado;
    }
    /**
     * Getter de Simbolo
     * @return el simbolo que puede ser un Barco o un Avión
     */
    public char getSimbolo() {
        return this.simbolo;
    }
    /**
     * Getter de Posición
     * @return retorna la posión en la que se encuentra en barco o el avión
     */
    public CasillaBarco[] getPosiciones() {
        return this.posiciones;
    }
    /**
     * Setter de Estado
     * @param e nuevo estado
     */
    public final void setEstado(char e){
        estado=e;
    }
    /**
     * Setter de Simbolo
     * @param s nuevo Simbolo
     */
    public final void setSimbolo(char s){
        this.simbolo=s;
    }
    /**
     * Setter de Posiciones
     * @param cb nueva posición
     */
    public final void setPosiciones(CasillaBarco[] cb){
        this.posiciones=cb;
    }
}
