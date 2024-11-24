package EjercicioDos.paqueteA;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
}
