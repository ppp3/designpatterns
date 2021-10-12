public class Main {

    public static void main(String[] args) {
        //Das sind viele Schritte, um eine Message zu schicken
        //Fassade Pattern soll das einfacher machen
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message("Hello"), "target");
        connection.disconnect();
    }
}
