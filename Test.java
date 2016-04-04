import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase Test
 * @author (Josu) 
 * @version (09/03/2015)
 */
public class Test
{
    // Edad del alumno.
    private int edad;
    // Nombres de los alumnos de la clase.
    private ArrayList<String> nombres;
    // Alumno de la clase.
    private Alumno alumno;
    private Random rnd;   
    private static int CANTIDAD_NOTAS;
    public static final int CANTIDAD_ALUMNOS = 5;
    
    /**
     * Constructor de la clase Test
     */
    public Test()
    {
        rnd = new Random();
        nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("María");
        nombres.add("Juan");
        nombres.add("Sara");
        nombres.add("Alberto");
        Collections.shuffle(nombres);    
        int nota;
        for (int i = 0; i < CANTIDAD_ALUMNOS; i++) {
            edad = (rnd.nextInt(19) + 50);
            CANTIDAD_NOTAS = rnd.nextInt(7);
            alumno = new Alumno(nombres.get(i), edad);
            for (int cont = 0; cont < CANTIDAD_NOTAS; cont++) {
                nota = rnd.nextInt(11);
                alumno.addNota(nota);
            }
            alumno.mostrarDatos();
        }
    }  
}