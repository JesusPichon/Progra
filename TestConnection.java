import java.util.ArrayList;
import java.util.List;

public class TestConnection {

    public static void main(String[] args) {

        List<Message> peticiones = new ArrayList<>();

        Servidor servidor = new Servidor(peticiones);
        Cliente cliente = new Cliente();

        //inciamos el hilo del proceso de escucha del servidor
        servidor.getReceiver().start();

        //cliente envia una nueva peticion
        cliente.send(peticiones, new Message(300));
    }
}
