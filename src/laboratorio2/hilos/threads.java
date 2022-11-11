package laboratorio2.hilos;

/**
 *
 * @author fepip
 */
public class threads extends Thread{
    private String nombre;
    private int retardo;
    
    //Constructor to start the thread and delay time
    public threads(String n,int r) {
        nombre = n;
        retardo = r;
    }
    //Run() method executes
    public void run(){
        try {
            //We delay the thread a bit with the time already spicified
            sleep(retardo);
        } catch (InterruptedException e) {
        }
        //We print the thread and what is delayed
        System.out.println("Prueba Hilos: "+nombre+retardo);
    }
    
    
}
