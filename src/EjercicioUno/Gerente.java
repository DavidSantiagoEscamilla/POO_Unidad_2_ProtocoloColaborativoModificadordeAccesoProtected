package EjercicioUno;

public class Gerente extends Empleado {
    private String departamento; //Propiedad adicional

    //Constructor que inicializa las propiedades de Empleado y Gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); //Llama al constructor de la clase base
        this.departamento = departamento; //Inicializa el departamento
    }

    //Sobrescribir el metodo mostrarInformacion
    @Override
    public void mostrarInformacion() {
        //Llamar al metodo de la clase base para mostrar nombre y salario
        super.mostrarInformacion();
        //Agregar la informacion especifica del gerente
        System.out.println("Departamento: " + departamento);
    }
}
