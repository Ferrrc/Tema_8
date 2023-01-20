public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(14);
        persona1.setNombre("Juan");
        persona1.setTelefono(978723285);

        System.out.println("Te llamas " + persona1.getNombre());
        System.out.println("Tienes " + persona1.getEdad());
        System.out.println("Tu numero es " + persona1.getTelefono());

    }
}

class Persona{
    private int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }


    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


    private int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}