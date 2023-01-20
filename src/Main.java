public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre = "Juan";
        cliente.telefono = 976298815;
        cliente.credito = 800;
        System.out.println("Mi nombre es " + cliente.nombre);
        System.out.println("Tengo " + cliente.edad + " años");
        System.out.println("Mi numero es " + cliente.telefono);
        System.out.println("Tengo un credito de " + cliente.credito + " soles");


        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.nombre = "Pedro";
        trabajador.telefono = 997822516;
        trabajador.salario =  3500;
        System.out.println("Mi nombre es " + trabajador.nombre);
        System.out.println("Tengo " + trabajador.edad + " años");
        System.out.println("Mi numero es " + trabajador.telefono);
        System.out.println("Tengo un salario de " + trabajador.salario + " soles");

    }
}

class Persona{
    int edad;
   String nombre;
   int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}