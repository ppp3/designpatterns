package aufgabe;

public class NumbersReader extends DataHandler{


    public NumbersReader(DataHandler next) {
        super(next);
    }

    @Override
    public boolean dohandle(String fileName) {
        if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from an Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}


