package aufgabe;

import java.net.http.HttpRequest;

public class XlsReader extends DataHandler{


    public XlsReader(DataHandler next) {
        super(next);
    }

    @Override
    public boolean dohandle(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
