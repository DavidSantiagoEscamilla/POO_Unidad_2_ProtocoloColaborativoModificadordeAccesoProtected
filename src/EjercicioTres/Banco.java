package EjercicioTres;

public class Banco {
    protected double saldo; //Uso incorrecto de protected

    //Constructor para inicializar el saldo
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial; //Inicializa el saldo
    }

    //Metodo para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

