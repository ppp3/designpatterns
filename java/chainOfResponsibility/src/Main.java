import aufgabe.DataHandler;
import aufgabe.DataReader;
import aufgabe.NumbersReader;
import aufgabe.XlsReader;

public class Main {

    public static void main(String[] args) {
        //authenticator -> logger -> compressor
        var compressor = new Compressor(null);
        var logger =new Logger(compressor);

        var authenticator=new Authenticator(logger);

        var server=new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));

        String filename=new String("dsfsd.numbers");
        var xlsReader=new XlsReader(null);
        var numbersReader=new NumbersReader(xlsReader);
        var reader=new DataReader(numbersReader);
        reader.handle("dsfsd.numbers");


    }
}
