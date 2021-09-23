package aufgabe;

public class ChatClient {

    private Encrypter encrypter;

    public ChatClient(Encrypter encrypter) {
        this.encrypter = encrypter;
    }

    public void send(String message) {
        encrypter.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}