import java.util.List;

public class Servidor {

    private Receiver receiver;

    public Servidor(List<Message> messages) {
        this.receiver = new Receiver(messages);
    }

    public Receiver getReceiver() {
        return receiver;
    }
}
