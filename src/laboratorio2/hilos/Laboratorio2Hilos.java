package laboratorio2.hilos;

/**
 *
 * @author fepip
 */
public class Laboratorio2Hilos {

    public static void main(String[] args) {
        //Creacion de los 3 hilos con el tiempo aleatorio
        threads t1,t2,t3;
        t1 = new threads("Hilo 1 ", (int)(Math.random()*2000));
        t2 = new threads("Hilo 2 ", (int)(Math.random()*2000));
        t3 = new threads("Hilo 3 ", (int)(Math.random()*2000));
        //Se incian los 3 hilos con el metodo .start
        t1.start();
        t2.start();
        t3.start();
    }
    
}
