package aufgabe;

public class Stock {

    public String getIsin() {
        return Isin;
    }

    public String getTitle() {
        return Title;
    }

    public double getValue() {
        return Value;
    }

    private String Isin;
    private String Title;
    private double Value;


    public Stock(String isin, String title, double value) {
        Isin = isin;
        Title = title;
        Value = value;
    }

}
