package EjercicioDos.paqueteB;

import EjercicioDos.paqueteA.Moto;

public class Main {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Pulsar", "NS200", 199);

        System.out.println(miMoto.marca); // este atributo no es visible
    }
}
