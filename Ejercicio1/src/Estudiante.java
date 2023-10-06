public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;

    public Estudiante(String nombre, int edad, int nota) {
        this.nombre = nombre;
        setEdad(edad); // Utilizamos el setter para aplicar validación de edad
        setNota(nota); // Utilizamos el setter para aplicar validación de nota
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor que cero.");
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        } else {
            System.out.println("La nota debe estar en el rango de 0 a 100.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, 85);

        estudiante.mostrarInformacion();

        estudiante.setEdad(-5); 
        estudiante.setNota(120);
    }
}
