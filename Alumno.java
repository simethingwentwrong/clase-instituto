

public class Alumno
{
    // Nombre del alumno.
    private String nombre;
    // Edad del alumno.
    private int edad;
    // Numero de clase del alumno.
    private int numeroClase;
    // Todas las notas del alumno.
    private int notas[];
    // Nota minima para aprobar.
    public static final int NOTA_APROBADO = 5;
    // El número de alumnos en la clase.
    public static int numeroAlumnos = 0;    
    /**
     * Constructor de la clase Alumno.
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;    
        notas = new int[0];
        numeroAlumnos += 1;
        numeroClase = numeroAlumnos;
    }

    /**
     * Añade una nota al alumno.
     */
    public void addNota(int nota) 
    {
        int tam[] = new int[notas.length + 1];
        int i;
        for(i = 0; i < notas.length; i++) {
            tam[i] = notas[i];
        }
        tam[i] = nota;
        notas = tam;
    }

    /**
     * Calcula la media de notas del alumno.
     */
    public int media() 
    {
        int media = 0;
        int i;
        if (notas.length != 0) {
            for (i = 0; i < notas.length; i++) {
                media += notas[i];
            }
            media = (media / i);
        }   
        return media;
    }
    
    /**
     * Devuelve true si esta aprobado, false en caso contrario.
     */
    public boolean estado()
    {
        return (media() >= NOTA_APROBADO);
    }
    
    /**
     * Muestra todos los datos de los alumnos.
     */
    public void mostrarDatos() 
    {
        String todasLasNotas = "[]";
        int media = 0;
        if (notas.length != 0) {
            todasLasNotas = "[" + notas[0];
            for (int i = 1; i < notas.length; i++) {            
                todasLasNotas += ", " + notas[i];
            }
            todasLasNotas += "]"; 
        }   
        
        if (media() != 0) {
            media = media();
        }
        System.out.println("Alumno: " + nombre + "\n Edad: " + edad + "\n Número de clase: " + numeroClase + "\n Notas: " + todasLasNotas + "\n Nota media: " + media + "\n ");
    }
}
