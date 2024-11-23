package EjercicioTres;

public class ClienteBanco extends Banco {
    //Constructor que inicializa el saldo del cliente
    public ClienteBanco(double saldoInicial) {
        super(saldoInicial); //Llama al constructor de la clase base
    }

    //Metodo para modificar directamente el saldo (uso incorrecto)
    public void modificarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo; 
    }
}
