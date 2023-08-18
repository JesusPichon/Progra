import java.util.Calendar;
import java.util.List;

public class Sender extends Thread {

    private int x;
    private List<Message> messages;

    public Sender(List<Message> messages) {
        this.messages = messages;
        this.x = (int) Math.round(Math.random() * 10);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void incrementar(Message message) {
        //incremento del sender
        message.setX(message.getX() + 1);
        message.setY(message.getY() + 1);
        this.messages.add(message);
    }

    @Override
    public void run() {
        while (true) {
            Message message = messages.remove(0);
            if (messages.size() != 0) {
                if (message.getCode() == 200) {
                    System.out.println("Mensaje sync/ack recibido");
                    incrementar(new Message(300));
                } else {
                    System.out.println("Paquete perdido");
                }
            }
        }
    }
}
