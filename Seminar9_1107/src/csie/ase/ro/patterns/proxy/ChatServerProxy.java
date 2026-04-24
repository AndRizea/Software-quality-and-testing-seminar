package csie.ase.ro.patterns.proxy;

public class ChatServerProxy implements IChatServer{
    IChatServer chatServer;
    String[] forbiddenWords = {"wrong", "stupid", "dumb"};

    public ChatServerProxy(IChatServer chatServer) {
        this.chatServer = chatServer;
    }

    @Override
    public void sendMessage(String username, String message) {
        for (String word : forbiddenWords){
            if(message.contains(word)){
                System.out.println("Message blocked: " + message);
                return;
            }
        }
        this.chatServer.sendMessage(username, message);
    }
}
