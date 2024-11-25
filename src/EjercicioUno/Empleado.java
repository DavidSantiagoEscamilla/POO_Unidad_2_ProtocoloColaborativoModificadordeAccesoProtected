package EjercicioUno;

public class Empleado {
    protected String nombre; //Propiedad protegida
    protected double salario; //Propiedad protegida

    //Constructor para inicializar las propiedades
    public Empleado(String nombre, double salario) {
        this.nombre = nombre; //Inicializa el nombre
        this.salario = salario; //Inicializa el salario
    }

    //Metodo para mostrar informacion del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
