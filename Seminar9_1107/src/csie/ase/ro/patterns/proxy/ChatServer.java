package csie.ase.ro.patterns.proxy;

public class ChatServer implements IChatServer{
    protected String ip;

    public ChatServer(String ip) {
        this.ip = ip;
    }

    @Override
    public void sendMessage(String username, String message) {
        System.out.println("Message sent from: " + username + ", message: " + message);
    }
}
