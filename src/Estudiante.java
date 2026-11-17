


public class Estudiante implements Comparable<Estudiante> {


    private String codigo;
    private String nombre;
    private int edad;
    private String carrera;
    private double nota;

    public Estudiante(String codigo, String nombre, int edad, double nota, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", nota=" + nota +
                '}';
    }
    @Override 
    public int compareTo(Estudiante otro) {
        return this.codigo.compareTo(otro.codigo); 
        
    }




    
}
    

