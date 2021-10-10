package aufgabe;


import java.net.http.HttpRequest;

public abstract class DataHandler {
    public DataHandler(DataHandler next) {
        this.next = next;
    }

    private DataHandler next;

    public void handle(String filename)
    {
        if ( dohandle(filename)) {

            return;
        }

        if (next!=null) {
            next.handle(filename);
        }

    }

    public abstract boolean dohandle(String filename);

}