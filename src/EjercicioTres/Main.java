package EjercicioTres;

public class Main {
    public static void main(String[] args) {
        //Crear un cliente del banco
        ClienteBanco cliente = new ClienteBanco(1000.00);

        //Mostrar el saldo inicial
        cliente.mostrarSaldo();

        //Modificar el saldo directamente (no seguro)
        cliente.modificarSaldo(5000.00);
        System.out.println("Saldo modificado incorrectamente:");

        //Mostrar el saldo despues de la modificacion
        cliente.mostrarSaldo();
    }
}
