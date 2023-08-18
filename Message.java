public class Message {

    //Codigo que corresponde al tipo de mensaje x,y
    private int code,x,y;

    public Message(int code) {
        this.code = code;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getCode() {
        return code;
    }
}
