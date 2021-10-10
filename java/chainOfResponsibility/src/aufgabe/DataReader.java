package aufgabe;

import java.net.http.HttpRequest;

public class DataReader {

    private DataHandler handler;

    public DataReader(DataHandler handler)
    {
        this.handler=   handler;
    }

    public void handle(String fileName)
    {
        handler.handle(fileName);

    }

    public void read(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

}
