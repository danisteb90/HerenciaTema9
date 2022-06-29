public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 22;
        cliente.nombre = "Diego";
        cliente.telefono = "0956742657";
        cliente.credito = "180 dias";

        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telf: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 35;
        trabajador.nombre = "Carlos";
        trabajador.telefono = "0947862116";
        trabajador.salario = 350;

        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Telf: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

final class Cliente extends Persona {
    String credito;
}

final class Trabajador extends Persona {
    int salario;
}