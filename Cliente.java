import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Sender sender;

    public Cliente() {
        this.sender = new Sender(new ArrayList<Message>());
    }

    public Sender getSender() {
        return sender;
    }

    public void send(List<Message> canal, Message message){
        canal.add(message);
    }
}
