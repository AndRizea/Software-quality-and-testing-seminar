package csie.ase.ro.patterns.proxy;

public class TestApp {
    public static void main(String[] args){
        IChatServer chatServer = new ChatServer("10.0.0.1");

        chatServer = new ChatServerProxy(chatServer);

        chatServer.sendMessage("John", "Hi");
        chatServer.sendMessage("Alice", "You are stupid");
    }
}
