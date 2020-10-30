/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Pajaro {
    
    /**
	 * nombre representa el nombre del pájaro. 
	 * posX es la coordenada X de la posición en la que está el pájaro en un momento dado.
	 * posY es la coordenada Y de la posición en la que está el pájaro en un momento dado.
	 */
    String nombre;
    int posX, posY;
    /**
	 * Constructor por defecto, sin parámetros. Crea un nuevo Pajaro, sin nombre, y situado en la posición 0,0, ya que los valores de los atributos
	 * numéricos se inicializan a 0 por defecto, y las referencias a null.
	 */
    public Pajaro() {

    }
    /**
	 * Constructor que recibe como parámetros los valores a asignar a los atributos del pájaro que se va a crear:
     * - El nombre que se pone al pájaro.
	 * - La posición de coordenadas (posX,posY) en la que se coloca al pájaro en el momento de su creación.
	 */
    public Pajaro(String nombre, int posX, int posY) {
        this.nombre=nombre;
        this.posX=posX;
        this.posY=posY;
    }
	
	/**
	 * Método que calcula el desplazamiento de un vuelo del pájaro, a partir del  desplazamiento en horizontal y del desplazamiento en vertical a partir de la posición de partida. 
	 * También se actualiza la posición del pájaro, calculando el nuevo valor para las coordenadas (posX,posY) en las que se encuentra. 
	 * @param posX. Representa el desplazamiento en el eje X del pájaro, respecto a la posición que ocupaba antes de volar.
	 * @param posY. Representa el desplazamiento en el eje X del pájaro, respecto a la posición que ocupaba antes de volar.
	 * @return double desplazamiento. Representa la distancia que separa en línea recta la posición que ocupaba inicialmente el pájaro y la posición en la que queda tras el vuelo.
	 */
    double volar (int posX, int posY) {

        double desplazamiento = Math.sqrt( posX*posX + posY*posY );
        this.posX += posX;
        this.posY += posY;

        return desplazamiento;
    }

    public static void main(String[] args) {

       Pajaro loro = new Pajaro("Lucy",50,50) ;
       System.out.println(loro);
       double d = loro.volar(50,50);
       System.out.printf("El desplazamiento ha sido %.2f \n" , d);
       System.out.println(loro);
       
    }
    
    public String toString() {
        return ("El pájaro " + this.nombre+" está en la posición ("+ this.posX+","+ this.posY+").");
    }
    
    
    
}
