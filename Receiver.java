import java.util.List;

public class Receiver extends Thread {

    private List<Message> messages;

    public Receiver(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        //Servidor en escucha
        while (true) {
            //Obtiene el primer mensaje que se mando y verificamos que halla mensajes pendientes
            if(messages.size() != 0) {
                Message message = messages.remove(0);
                switch (message.getCode()) {
                    case 100:
                        System.out.println("Mensaje sync recibido");
                        System.out.println("x = " + message.getX());
                        break;
                    case 200:
                        System.out.println("Mensaje ack recibido");
                        System.out.println("x = " + message.getX());
                        System.out.println("y = " + message.getY());
                        break;
                    default:
                        System.out.println("Mensaje perdido");
                        break;
                }
            }
        }
    }
}
