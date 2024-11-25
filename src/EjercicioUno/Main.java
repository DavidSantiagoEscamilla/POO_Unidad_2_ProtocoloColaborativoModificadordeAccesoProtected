package EjercicioUno;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan Perez", 50000);

        //Crear un objeto de la clase Gerente
        Gerente gerente = new Gerente("Laura Gomez", 75000, "Recursos Humanos");

        //Mostrar informacion del Empleado
        System.out.println("Informacion del Empleado:");
        empleado.mostrarInformacion();

        //Mostrar informacion del Gerente
        System.out.println("\nInformacion del Gerente:");
        gerente.mostrarInformacion();
    }
}
